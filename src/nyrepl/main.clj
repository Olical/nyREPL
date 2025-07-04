(ns nyrepl.main
  (:require [clojure.java.io :as io]
            [sci.core :as sci])
  (:gen-class))

(defn -main [& args]
  (println "Hello, World!" (sci/eval-string (slurp (io/resource "nyrepl/adapters/python.clj")))))

# nyREPL

An experiment at the moment. Goals:

- Single binary from GraalVM native compilation.
- Can be configured (using interpreted Clojure files as configuration) to support any REPL.
- Wraps a REPL like `python` and proxies it's stdio streams into an nREPL server.
- Replace almost all of [Conjure's](https://github.com/Olical/conjure) special stdio REPL interpretation code with nREPL connections.
- If this PoC works, stretch goals
  - Support other IO, like socket files
  - Support other REPL types like prepl output
  - Support REPL translation, prepl <-> nREPL
  - Find some way to support running nyREPL as a sub-process of some app if required in some environments, use it like a library.
  - Support more than just stdio, if it can read Janet's netrepl and spit out nREPL that's even more code we can delete from Conjure.

I aim to make this a universal translator to nREPL concepts so that Conjure can simplify down to an opinionated bundle of nREPL clients.

## Notes

 - [sci](https://github.com/babashka/sci) might be the best way to provide configuration scripts per language.

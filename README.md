# cljs-main-code-splitting
Testing of closure module based code splitting with the clj/cljs.main tools

First `clj -m cljs.main -co co.edn -c`

Then `clj -m cljs.main -r`

For an example of using this framework to build third party modules "downstream"
and consume them, see [mod-acme](https://github.com/johnmn3/mod-acme).

(ns mod-init.main
  (:require
    [cljs.loader :as loader]))

(enable-console-print!)

;; depends on all modules but not lib four

(println "mod-init.main launching")

(println "in mod-init calling hi-one")
(loader/load :mod-one
  (fn []
    ((resolve 'mod-one.main/hi-one))))

(println "in mod-init calling hi-two")
(loader/load :mod-two
  (fn []
    ((resolve 'mod-two.main/hi-two))))

(println "in mod-init calling hi-three")
(loader/load :mod-three
  (fn []
    ((resolve 'mod-three.main/hi-three))))

(loader/set-loaded! :mod-init)

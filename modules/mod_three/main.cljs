(ns mod-three.main
  (:require
   [mod-four.main :as four]
   [cljs.loader :as loader]))

(enable-console-print!)

;; module three depends on lib four and module one and two

(println "mod-three.main launching")

;; provides
(defn hi-three []
  (println "hi from mod-three.main"))


;; use lib
(println "mod-three.main calling hi-four")
(four/hi-four)


;; user modules
(println "in mod-three calling hi-one")
(loader/load :mod-one
  (fn []
    ((resolve 'mod-one.main/hi-one))))

(println "in mod-three calling hi-two")
(loader/load :mod-two
  (fn []
    ((resolve 'mod-two.main/hi-two))))

(loader/set-loaded! :mod-three)

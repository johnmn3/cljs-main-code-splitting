(ns mod-two.main
  (:require
   [mod-four.main :as four]
   [cljs.loader :as loader]))

(enable-console-print!)

;; depends on lib four and module one

(println "mod-two.main launching")

;; provides
(defn hi-two []
  (println "hi from mod-two.main"))


;; call lib
(println "mod-two.main calling hi-four")
(four/hi-four)


;; call modules
(println "in mod-two calling hi-one")
(loader/load :mod-one
  (fn []
    ((resolve 'mod-one.main/hi-one))))

(loader/set-loaded! :mod-two)

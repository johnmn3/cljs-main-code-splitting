(ns mod-one.main
  (:require
    [cljs.loader :as loader]))

(enable-console-print!)

; mod-one has no module or library dependencies

(println "mod-one.main launching")


;; provides
(defn hi-one []
  (println "hi from mod-one.main"))

(loader/set-loaded! :mod-one)

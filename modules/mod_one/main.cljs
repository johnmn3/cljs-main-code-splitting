(ns mod-one.main
  (:require
    [mod-base.lazy :as base]
    [cljs.loader :as loader]))

(enable-console-print!)

(defn hi-one [arg]
  (println "hi" arg "from mod-one"))

(loader/set-loaded! :mod-one)

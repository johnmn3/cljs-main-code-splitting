(ns mod-base.main
  (:require
    [cljs.loader :as loader]))

(defn default-state [] {:host "http://localhost" :port 3000})

(loader/set-loaded! :mod-base)

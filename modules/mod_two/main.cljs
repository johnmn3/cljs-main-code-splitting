(ns mod-two.main
  (:require
   [mod-base.lazy :as base]
   [mod-one.lazy :as one]
   [mod-four.main :as four]
   [cljs.loader :as loader]))

(enable-console-print!)

;; provides
(defn hi-two [n] (println "2 + " n " is " (+ 2 n)))


;; call lib
(four/hi-four)

;; call modules
(one/hi-one "mod-two")


(loader/set-loaded! :mod-two)

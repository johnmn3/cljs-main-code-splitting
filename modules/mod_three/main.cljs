(ns mod-three.main
  (:require
   [mod-one.lazy :as one]
   [mod-two.lazy :as two]
   [mod-four.main :as four]
   [cljs.loader :as loader]))

(enable-console-print!)

;; provides
(defn hi-three [x]
  (dotimes [n 3]
    (println x n "times")))


;; call lib
(four/hi-four)


;; call modules
(one/hi-one "mod-three")

(two/hi-two 3)

(loader/set-loaded! :mod-three)

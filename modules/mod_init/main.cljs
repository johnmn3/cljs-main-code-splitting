(ns mod-init.main
  (:require
    [cljs.loader :as loader]
    [mod-one.lazy :as one]
    [mod-two.lazy :as two]
    [mod-three.lazy :as three]
    [mod-four.main :as four]))

(loader/set-loaded! :mod-init)

(enable-console-print!)

(println "mod-init.main started")

(one/hi-one "mod-init")

(two/hi-two 100)

(three/hi-three "mod-init")

(four/hi-four)

(println "mod-init.main finished")

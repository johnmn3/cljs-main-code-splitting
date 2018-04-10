(ns mod-two.lazy
  (:require-macros
   [mod-base.macros :refer [defxmod]]))

(defxmod hi-two :mod-two 'mod-two.main/hi-two)

(ns mod-one.lazy
  (:require-macros
   [mod-base.macros :refer [defxmod]]))

(defxmod hi-one :mod-one 'mod-one.main/hi-one)

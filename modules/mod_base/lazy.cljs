(ns mod-base.lazy
  (:require-macros
   [mod-base.macros :refer [defxmod]]))

(defxmod default-state :mod-base 'mod-base.main/default-state)

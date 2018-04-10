(ns mod-base.macros)

;; depends on all modules but not lib four

;(println "mod-init.main launching")

(defmacro defxmod [afname mod-key quoted-fn]
  `(def ~afname
     (fn [& args#]
       (let [loaded?# (cljs.loader/loaded? ~mod-key)]
         (if loaded?#
           (if-not (empty? args#)
             (apply (resolve ~quoted-fn) args#)
             ((resolve ~quoted-fn)))
           (cljs.loader/load ~mod-key
             (fn []
               (if-not (empty? args#)
                 (apply (resolve ~quoted-fn) args#)
                 ((resolve ~quoted-fn))))))))))

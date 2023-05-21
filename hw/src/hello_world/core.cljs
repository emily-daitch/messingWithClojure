(ns hello-world.core
  (:require [cljs.core :as core]))

(println "Hello world!")

;; == Evaluating in Threaded Expressions
;; Ctrl+Alt+Enter will evaluate the current enclosing
;; form up to the cursor. Useful in threaded
;; expressions. Say you want to calculate the average
;; ratings for the data below:

(comment
  ;; First you need to top-level evaluate this
  (def colt-express
    {:name "Colt Express"
     :categories ["Family"
                  "Strategy"]
     :play-time 40
     :ratings {:pez 5.0
               :kat 5.0
               :wiw 5.0
               :vig 3.0
               :rex 5.0
               :lun 4.0}})

  ;; And this
  (defn average [coll]
    (/ (apply + coll) (count coll)))

  ;; This too, if you like
  (->> colt-express
       :ratings
       vals
       average)

  ;; To see the result at each step in the thread
  ;; You can also Ctrl+Alt+Enter after each form.
  ;; Place the cursor after `(->> colt-express` and
  ;; try it. Then after `:ratings`, and after `vals`.
  :rcf)
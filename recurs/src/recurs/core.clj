(ns recurs.core
  (:gen-class))

(defn sum
 ([vals] (sum vals 0))
 ([vals accumulate]
     (if (empty? vals)
       accumulate
       (sum (rest vals) (+ (first vals) accumulate)))))

(defn mult
  ([vals] (mult vals 1))
  ([vals accumulate]
    (if (empty? vals)
      accumulate
      (mult (rest vals) (* (first vals) accumulate)))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (sum [2 4]))
  (println (mult [6 4 2])))

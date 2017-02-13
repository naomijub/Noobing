(ns reduce-filter.core
  (:gen-class))

(defn even
  ([] (even 2))
  ([n] (cons n (lazy-seq (even (+ n 2))))))

(defn -main
  "using reduce for now"
  [& args]
  (def approved-students (reduce (fn [new-students-map [key val]]
          (if (> val 7.0)
            (assoc new-students-map key val)
            new-students-map)) {}
        {:Arthur 9.5
         :Diego 9.2
         :Julia 9.3
         :Nelson 7.4
         :Manuela 6.0
         :Lenora 7.1
         :Vicente 8
         :Theo 6.6
         :Fermina 7.8}))
  (println approved-students)
  (def seqrize (sort-by count approved-students))
  (def crazy-num-vals (filter #(> (get % 1) 9.0) seqrize))
  (def b-students (filter #(and (< (get % 1) 9.0) (> (get % 1) 7.5)) seqrize))
  (println seqrize)
  (println "A grade students are: " crazy-num-vals)
  (println "B grade students are: " b-students)
  (println "a few even numbers greater than 0: 'Crazy recursion' " (take 10 (even)))
)

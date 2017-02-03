(ns stop-noobing.core
  (:gen-class))

(defn -main
  [& args]
  (defn fatorial_step
    [step]
    (if (<= step 1)
    1
    (* step (fatorial_step (- step 1))))
  )
  (println (map
    (fn [number] (fatorial_step number))
    [1 2 3 4 5])
  )
  (defn multi-inc
    "Increments a valur by a selected variable value"
    [incrementer]
    #(+ % incrementer)
  )
  (def inc5 (multi-inc 5))
  (println "Increments 5 by 5 = " (inc5 5))
)

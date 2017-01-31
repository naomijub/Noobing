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
)

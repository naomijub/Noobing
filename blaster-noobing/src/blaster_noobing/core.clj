(ns blaster-noobing.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Increment [1 2 3 4]: " (map inc [1 2 3 4]))
  (println "Reduce + [20 30 50]: " (reduce + [20 30 50]))
  (println "Reduce - [20 30 50]: " (reduce - [20 30 50]))
  (println "Reduce / [20 30 50]: " (reduce / [20 30 50]))
  (println "Crazy math (+ 1 (* 2 3) 2)" (+ 1 (* 2 3) 2))
  (println "'Panda' + '3D' + 'Course' = " (str "Panda" "3D " "Course"))
  (if (> 3 2)
    (println "By Odin's bear!!")
    (println "You crazy Joke!")
  )
)

(ns next-level-noob.core
  (:gen-class))

(defn -main
  [& args]
  (defn next_noobing_level
    "Noobing to the next level"
    [level]
    (println (str "Your noobing level was inc from "
      level " to " (inc level))
    )
  )
  (next_noobing_level 3)
  (defn times_use
    [time]
    (if (= time "1")
    "time"
    "times")
  )
  (defn multi_arity
    "Playing with multi_arity"
    ([opponent move times]
      (str "I will hit " opponent " with " move " " times " " (times_use times)))
    ([opponent move]
      (multi_arity opponent move "1"))
    ([opponent]
      (multi_arity opponent "Hadouken" "1"))
  )
  (println (multi_arity "Seth" "kick" "5"))
  (println (multi_arity "Guile" "Punch"))
  (println (multi_arity "Dan"))

  (defn foods
    [my_name & food]
    (str "I, " my_name ", do love the following foods: "
      (clojure.string/join ", " food)
    )
  )
  (println (foods "naomijub" "bibimbap" "takkalbi" "bulgogi"))

)

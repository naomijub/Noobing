(ns clj-brave-true-hobbit.core
  (:gen-class))

(defn -main
  "Hobbit example from Clojure for the Brave and True"
  [& args]
  (def hobbit-left-side [{:name "Head" :size 3}
                        {:name "left-arm" :size 5}
                        {:name "left-leg" :size 7}
                        {:name "torso" :size 5}
                        {:name "left-foot" :size 2}
                        {:name "left-hand" :size 2}])
  (defn match-parts
    "match left parts to its right parts"
    [part]
    {:name (clojure.string/replace (:name part) #"left-" "right-")
     :size (:size part)}
  )
  (defn hobbit-body
    "Expects to return a whole hobbit body"
    [hobbit-left-side]
    (loop [remaining-body-parts hobbit-left-side
      final-body-parts []]
      (if (empty? remaining-body-parts)
        final-body-parts
        (let [[part & remaining] remaining-body-parts]
          (recur remaining
            (into final-body-parts
              (set [part (match-parts part)])
            )))
        ))
    )
    (def hobbit-list
      ["Frodo" "Sam" "Merry" "Pippin" "Bilbo"])
    (defn +X
      [a b]
      (str a " and " b))
    (defn power-up
      [hobbit]
      (str hobbit " will be Brave and True"))
    (println "The Hobbits are "(reduce +X hobbit-list))
    (println "The fellowship hobbits are " (reduce +X (let [hobbits (take 4 hobbit-list)]
      hobbits)))
    (println "The Hobbits body parts are " (hobbit-body hobbit-left-side))
    (println (map power-up hobbit-list))
)

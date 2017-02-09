(ns mathing.core
  (:gen-class)
  (:require [mathing.stats :refer :all]))

(defn -main
  "Basic Stats"
  [& args]
  (def blood-consumption {:carlos [3 6 2 8 6 11 7], :artur [4 7 9 6 7 12 13]})

  (println (stats (:carlos blood-consumption)))
)

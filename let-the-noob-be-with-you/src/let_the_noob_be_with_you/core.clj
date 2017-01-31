(ns let-the-noob-be-with-you.core
  (:gen-class))

(defn -main
  [& args]
  (def star_wars {:best "Chewwie" :last "Luke" :power "Leia"})
  (println (:power star_wars))
  (def mega_blaster_wars {:ep1 {:old "Yoyoda" :crazy "Maul" :master "Qigon Jin"} :ep3 {:vader "Darth Vader"}})
  (println (:crazy (:ep1 mega_blaster_wars)))
  (def crazy_games ["Lol" "Heroes" "Dota"])
  (println (get crazy_games 0))
  (def crazyness (conj crazy_games "Age of Empires"))
  (println (get crazyness 3))
  (def my_sw_lis '(:best :last :power))
  (println ((nth my_sw_lis 0) star_wars))
  )

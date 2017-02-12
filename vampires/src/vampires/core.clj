(ns vampires.core
  (:gen-class))

(def vampire-database
  {034534 {:makes-blood-hunts? false, :has-pulse? true  :name "Paula"}
   134563 {:makes-blood-hunts? false, :has-pulse? true  :name "Priscila"}
   263456 {:makes-blood-hunts? true,  :has-pulse? false :name "Dracula"}
   365466 {:makes-blood-hunts? true,  :has-pulse? true  :name "Mickey Mouse"}
   445654 {:makes-blood-hunts? true,  :has-pulse? false :name "Lady Sith"}
   554645 {:makes-blood-hunts? false,  :has-pulse? false :name "Darth Vader"}
   666000 {:makes-blood-hunts? true,  :has-pulse? false :name "Bloodpool"}})

(defn vampire-details
  [rg]
  (Thread/sleep 1000)
  (get vampire-database rg))

(defn vampire?
  [person]
  (and (:makes-blood-puns? person)
       (not (:has-pulse? person))
       person))

(defn find-vampires
  [rg]
  (first (filter vampire?
                 (map vampire-details rg))))

(defn -main
  [& args]
  (println (keys vampire-database))
  (println (time vampire-details 666000)))

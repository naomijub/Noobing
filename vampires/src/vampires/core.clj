(ns vampires.core
  (:gen-class))

(def vampire-database
  {0 {:makes-blood-hunts? false, :has-pulse? true  :name "Paula"}
   1 {:makes-blood-hunts? false, :has-pulse? true  :name "Priscila"}
   2 {:makes-blood-hunts? true,  :has-pulse? false :name "Dracula"}
   3 {:makes-blood-hunts? true,  :has-pulse? true  :name "Mickey Mouse"}
   4 {:makes-blood-hunts? true,  :has-pulse? false :name "Lady Sith"}
   5 {:makes-blood-hunts? false,  :has-pulse? false :name "Darth Vader"}
   6 {:makes-blood-hunts? true,  :has-pulse? false :name "Bloodpool"}})

(defn vampire-details
  [rg]
  (get vampire-database rg))

(defn vampire?
  [person]
  (and (:makes-blood-hunts? person)
       (not (:has-pulse? person))
       person))

(defn find-vampires
  [rg]
  (filter vampire?
   (map vampire-details rg)))

(defn -main
  [& args]
  (def vamp-keys (keys vampire-database))
  (println (find-vampires vamp-keys)))

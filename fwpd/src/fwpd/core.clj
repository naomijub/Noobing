(ns fwpd.core
  (:gen-class))

(def filename "suspects.csv")
(def vamp-keys [:name :vampireness])
(defn str->int
  [str]
  (Integer. str))

(def conversions {:name identity
                  :vampireness str->int})
(defn convert
  [vamp-key value]
  (get conversions vamp-key) value)

(defn parse
  "Convert a CSV into rows of columns"
  [string]
  (map #(clojure.string/split % #",")
       (clojure.string/split string #"\n")))

(defn -main
  "FWPD vamps analyser"
  [& args]
  (println (parse (slurp filename))))

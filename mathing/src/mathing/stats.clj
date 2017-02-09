(ns mathing.stats
  (:require [clojure.math.numeric-tower :as math]))

(def sum #(apply + %))
(def mult #(apply * %))
(def avg #(/ (sum %) (count %)))
(def geo-avg #(math/expt (mult %) (/ 1 (count %))))
(def geoavg #(Math/pow (mult %) (/ 1 (count %))))
(defn stats
  [numbers]
  (map #(% numbers) [sum count #(float (avg %)) geoavg geo-avg]))

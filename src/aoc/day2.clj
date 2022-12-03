(ns aoc.day2
  (:require [clojure.string :as str]))
(def hands (str/split (slurp "src/aoc/day2.input") #"\n"))

(defn solve-hand [x] (case x "A X" 4 "A Y" 8 "A Z" 3 "B X" 1 "B Y" 5 "B Z" 9 "C X" 7 "C Y" 2 "C Z" 6)) 
(println (apply + (map solve-hand hands)))

(defn solve-hand [x] (case x "A X" 3 "A Y" 4 "A Z" 8 "B X" 1 "B Y" 5 "B Z" 9 "C X" 2 "C Y" 6 "C Z" 7))
(println (apply + (map solve-hand hands)))


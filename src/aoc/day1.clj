(def common_part (map 
                  (fn [x] (reduce #(+ %1 (Integer/parseInt %2)) 0 x)) 
                  (map #(str/split % #"\n") 
                       (str/split (slurp "/home/lautaro/Workspace/aoc22/aoc/src/aoc/day1.input") #"\n\n"))))

(println (apply max common_part))
(println (apply + (take 3 (sort (comp - compare) common_part)))) 

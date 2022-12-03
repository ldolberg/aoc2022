(defn solve-rucksack [x] (let [len (count x) lower (set (take (/ len 2) x)) upper (set (take-l
                                                                                         ast (/ len 2) x))] (int (first (clojure.set/intersection lower upper))))) 

(apply + (map (fn [x]  (if (<= 91 x) (+ 1 (- x (int \a))) (+ 27 (- x (int \A))))) (map solve-r
                                                                                       ucksack rucksacks)))
(apply + (map (fn [x]  (if (<= 91 x) (+ 1 (- x (int \a))) (+ 27 (- x (int \A))))) (map int (map #(first (apply clojure.set/intersection (map set %))) (partition 3 rucksacks)))))

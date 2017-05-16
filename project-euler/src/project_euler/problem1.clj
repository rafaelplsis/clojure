;;If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
;;          The sum of these multiples is 23.
;;Find the sum of all the multiples of 3 or 5 below 1000

(defn soma-multiplicadores []
  (loop [total 0 soma 0] 
     (if (< total 1000)
            (if (or (= (mod total 3) 0) (= (mod total 5) 0))
              (recur (inc total) (+ total soma))
              (recur (inc total) soma))
            soma)))


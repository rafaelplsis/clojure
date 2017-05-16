(ns forca.lista
  (:gen-class))

(defn duplica-lista[ttr lst]
    (doseq [n lst]
        ((fn [n c]
        (do
          (if(< c ttr )
              (do
                  (println n) 
                  (recur n (inc c)))))) n 0)))
    
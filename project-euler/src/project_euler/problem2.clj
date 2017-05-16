(defn fibonacci 
  ([begin next] (fibonacci begin next (+ begin next)))
  ([begin next sum]
   (if (>= next 317) 
     sum 
     (let [valorf (+ begin next)] (recur next valorf (+ sum valorf))))))
  
   
              
              
          
          
          
          
          
          
        
  

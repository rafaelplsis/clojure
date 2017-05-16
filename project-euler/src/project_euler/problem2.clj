(defn fibonacci 
  ([begin next] (fibonacci begin next 0))
  ([begin next sum]
   (if (< next 4000000)  
     (let [valorf (+' begin next)] (recur next valorf (if (= (mod valorf 2) 0) 
                                                        (+' sum valorf) sum)))
     sum)))
  
   
              
              
          
          
          
          
          
          
        
  

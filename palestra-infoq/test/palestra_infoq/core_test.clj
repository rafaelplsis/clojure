(ns palestra-infoq.core-test
  (:require [clojure.test :refer :all]
            [palestra-infoq.core :refer :all]
            ))

(deftest my-reduce-function
    (testing "result 1 for addition function, with val of 1 and empty collection"
        (is (= 1 (my-reduce + 1 '())))))

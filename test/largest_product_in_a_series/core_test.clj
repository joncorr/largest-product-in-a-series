(ns largest-product-in-a-series.core-test
  (:require [clojure.test :refer :all]
            [largest-product-in-a-series.core :refer :all]))

(def path "resources/1000digitnumber.txt")

(def x-digit-str (get-x-digit-number path))

(def x-digit-int (convert-str-to-number-coll x-digit-str))


(deftest find-largest-product-4digits-5832
 (testing "the largest four-digit product is 5832"
  (is (= (find-largest-product x-digit-int 4) [5832 '(9 9 8 9)]))))


  ; (run-tests 'largest-product-in-a-series.core-test)

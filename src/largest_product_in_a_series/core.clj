(ns largest-product-in-a-series.core
  (:gen-class)
  (:require [clojure.string :as str])
  (:import [java.lang.Integer]))

(defn get-x-digit-str [filepath]
 (.replace (slurp filepath) "\r\n" ""))

(defn first-str [string]
 (subs string 0 1))

(defn rest-str [string]
 (subs string 1))

(defn convert-str-to-number-coll [string]
  (loop [result [] string string]
   (if (empty? string)
     result
     (let [first (first-str string)
           rest  (rest-str string)
           first-no (Integer/parseInt first)]
      (recur (conj result first-no) rest)))))

 (defn find-largest-product [vector-of-ints adjacent-digits]
  (loop [largest-prod 0 nums vector-of-ints prev-nums []]
     (if (empty? nums)
       [largest-prod prev-nums]
       (let [adjacent-nums (take adjacent-digits nums)
             product (reduce * adjacent-nums)
             remaining-nums (rest nums)]
          (if (> product largest-prod)
            (recur product remaining-nums adjacent-nums)
            (recur largest-prod remaining-nums prev-nums))))))

(defn -main
  [& args]
   (let [file-path "resources/1000digitnumber.txt"
         x-digit-str (get-x-digit-str file-path)
         x-digit-int (convert-str-to-number-coll x-digit-str)
         adjacent-digits 13
         int-vector (convert-str-to-number-coll x-digit-str)]
         (prn (str "The largest product of "
                   adjacent-digits
                   " adjacent digits is "
                    (find-largest-product
                        int-vector
                        adjacent-digits)))))

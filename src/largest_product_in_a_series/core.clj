(ns largest-product-in-a-series.core
  (:gen-class)
  (:require [clojure.string :as str]))


(def filepath "C:\\Users\\gideon\\Documents\\GitHub\\largest-product-in-a-series\\resources\\1000digitnumber.txt")

(defn get-x-digit-number [filepath]
 (.replace (slurp filepath) "\r\n" ""))

(defn foo [x-digit-number]
 (str/split x-digit-number #"0"))

(defn length-less-than-13? [string]
 (if (or (str/blank? string) (< (count string) 13))
   true
   false))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(ns largest-product-in-a-series.core
  (:gen-class)
  (:require [clojure.string :as str]))

(defn get-x-digit-number [filepath]
 (.replace (slurp filepath) "\r\n" ""))

(defn split-into-vectors [x-digit-number]
 (str/split x-digit-number #"0"))

(defn length-less-than-13? [string]
 (if (or (str/blank? string) (< (count string) 13))
   true
   false))

(def greater-than-13? (complement length-less-than-13?))

(defn remove-number-sequences-less-than-13 [vectors]
 (filter greater-than-13? vectors))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

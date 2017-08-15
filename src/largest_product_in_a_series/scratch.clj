
(ns largest-product-in-a-series.core
  (:gen-class :name scratch)
  (:require [clojure.string :as str]))

(def s "01234567890")

(subs s (inc (str/index-of s \0)))

(str/split s #"5")

(System/getProperty "user.dir")

(def filepath "resources/1000digitnumber.txt")

(def x-digit-number (get-x-digit-number filepath))

(def vectors (split-into-vectors x-digit-number))

(map (partial count) (remove-number-sequences-less-than-13 vectors))

(convert-str-to-number-coll "1234568")

(find-largest-product [1 2 3 4 5 5 5 5 1 2] 6)

(for [vector vectors] [(find-largest-product
                       (convert-str-to-number-coll vector) 4)
                       vector])

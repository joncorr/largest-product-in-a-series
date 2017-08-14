
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

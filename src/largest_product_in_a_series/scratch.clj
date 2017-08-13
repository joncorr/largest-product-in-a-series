
(:use [clojure.string :as str])

(def s "01234567890")

(subs s (inc (str/index-of s \0)))

(str/split s #"5")

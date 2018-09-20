(ns overtone-play.core
  (:use [overtone.core])
  (:require [overtone.live :as ol]
            [overtone.inst.sampled-piano :as oisp])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (oisp/sampled-piano 60))

(ns overtone-play.core
  (:require [overtone.live :as ol]
            [overtone.inst.sampled-piano :as oisp])
  (:use overtone.core)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (oisp/sampled-piano 60))

(ns overtone-play.core
  (:use [overtone.core])
  (:require [overtone.live :as ol]
            [overtone.inst.sampled-piano :as oisp])
  (:gen-class))

(defn -main
  [& _]
  (let [m (metronome 120)]
    (at (m 1) (oisp/sampled-piano 60))))

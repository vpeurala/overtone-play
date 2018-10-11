(ns overtone-play.piano
  (:use [overtone.core])
  (:require [overtone.live :as ol]
            [overtone.inst.sampled-piano :as oisp])
  (:gen-class))

(def kick (sample (freesound-path 2086)))

(def metro (metronome 120))

(defn player []
  (let [beat (metro)]
    (at (metro beat) (kick))
    (apply-by (metro (+ 4 beat)) player)))

(player)

(stop)

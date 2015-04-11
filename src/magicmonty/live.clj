(ns magicmonty.live
  (:use [overtone.live :refer :all]
        [leipzig.melody :refer :all]
        [magicmonty.live.synths])
  (require [leipzig.scale :as scale]
           [leipzig.live :as ll]
           [leipzig.chord :as chord]
           [leipzig.temperament :as temperament]))



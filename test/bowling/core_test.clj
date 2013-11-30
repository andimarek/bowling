(ns bowling.core-test
  (:use midje.sweet)
  (:use [bowling.core]))

(facts "about `bowling-game`"
       (fact "should return the sum of rolls"
             (bowling-game [1]) => 1
             (bowling-game [1 2]) => 3)
       (fact "should add a spare bonus"
             (bowling-game [5 5 3]) => 16))



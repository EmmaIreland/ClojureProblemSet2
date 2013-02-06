(ns SmallestFreeNumber)

(use 'clojure.test)

;; The task here is to write a function minfree that takes a set of non-negative integers 
;; and returns the smallest non-negative integer that isn't in the given list. You can 
;; think of the incoming list as the indices of a set of resources that are currently being 
;; used, and you're returning the smallest index of an unused resource.







(is (= 0 (minfree #{})))
(is (= 2 (minfree #{ 0, 1 })))
(is (= 2 (minfree #{ 1, 0 })))
(is (= 2 (minfree #{ 0, 1, 8, 9 })))
(is (= 0 (minfree #{ 1, 2, 3 })))
(is (= 15 (minfree #{ 8, 23, 9, 0, 12, 11, 1, 10, 13, 7, 41, 4, 14, 21, 5, 17, 3, 19, 2, 6 })))
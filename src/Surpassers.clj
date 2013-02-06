(ns Surpassers)

(use 'clojure.test)




(is (= 0 (max-surpasser-count [5])))
(is (= 0 (max-surpasser-count [\a])))
(is (= 0 (max-surpasser-count [1 0])))
(is (= 1 (max-surpasser-count [0 1])))
; The first \e has six larger characters to its right
(is (= 6 (max-surpasser-count [\g \e \n \e \r \a \t \i \n \g])))
(is (= 6 (max-surpasser-count "generating")))
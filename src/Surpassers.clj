(ns Surpassers)

(use 'clojure.test)

(defn num-surpassers [letter coll]
	(count (filter true? (map #(if (<= (compare letter %) -1)
                              true
                              false)
                           coll)
                )
        )
)

(defn max-surpasser-helper [a coll]
  (let [keep-max #(if (> %1 %2) %1 %2)]
        (loop [letter a restColl coll max 0]
                (if (empty? restColl) max
                  (recur (first restColl) (subvec restColl 1) (keep-max max (num-surpassers letter restColl)))
                  )
                )
        )
 )

(defn max-surpasser-count [string]
  (if (vector? string)
    (max-surpasser-helper (first string) string)
    (max-surpasser-helper (first (subvec (clojure.string/split string #"\s*") 1)) (subvec (clojure.string/split string #"\s*") 1)) 
  )
) 


(is (= 0 (max-surpasser-count [5])))
(is (= 0 (max-surpasser-count [\a])))
(is (= 0 (max-surpasser-count [1 0])))
(is (= 1 (max-surpasser-count [0 1])))
; The first \e has six larger characters to its right
(is (= 6 (max-surpasser-count [\g \e \n \e \r \a \t \i \n \g])))
(is (= 6 (max-surpasser-count "generating")))
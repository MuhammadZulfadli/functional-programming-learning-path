;; Problem: https://www.hackerrank.com/challenges/fp-list-replication/problem

(defn list-replication
  [n list]
  (doseq [item list]
    (dotimes [_ n] (println item))))

(list-replication 3 [1 2 3])
(list-replication 2 [4 5])
(list-replication 1 [10 100])

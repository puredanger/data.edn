(ns edn-data-gen.generators-test
  (:use edn-data-gen.generators
        clojure.test
        clojure.test.generative))

(deftest ns-str-test
  (testing "namespace generation"
    (doseq [n (range 1 12)]
      (let [sizers (range 1 n)]
        (is (= (max 0 (dec (count sizers)))
               (count (re-seq #"\." (apply ns-str sizers)))))))))

(deftest ns-symbol-test
  (testing "namespace qualified symbol generation"
    (doseq [n (range 1 12)]
      (let [sizers (range 1 n)
            ns-sizers (butlast sizers)
            sym (apply ns-symbol sizers)]

        (is (= (max 0 (dec (count ns-sizers)))
             (count (re-seq #"\." (namespace sym)))))
        (is (= 1 (count (re-seq #"/" (str sym)))))))))

;; (defspec lots-of-symbols
;;   ns-symbol)

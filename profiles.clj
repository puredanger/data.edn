{:dev
 {:plugins [[codox "0.6.3"]]
  :codox {:src-dir-uri "http://github.com/ThorTech/data.edn/blob/master"
          :src-linenum-anchor-prefix "L"
          :exclude [com.thortech.data.edn.file-util]}}
 :release
 {:plugins [[lein-set-version "0.2.1"]]
  :set-version
  {:updates [{:path "README.md" :no-snapshot true}]}}}

(defproject com.gfredericks/seventy-one "0.1.2-SNAPSHOT"
  :description "71 in Clojure"
  :url "https://github.com/gfredericks/seventy-one"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :plugins [[codox "0.8.12"]
            [lein-cljsbuild "1.0.6"]]
  :deploy-repositories [["releases" :clojars]]
  :profiles {:dev {:dependencies [[org.clojure/clojurescript "0.0-3308"]
                                  [org.clojure/test.check "0.7.0"]]
                   :cljsbuild {:builds [{:source-paths ["src" "test"]
                                         :compiler {:output-to "resources/private/js/unit-test.js"
                                                    :optimizations :whitespace
                                                    :pretty-print true}}]}}})

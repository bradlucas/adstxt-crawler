(defproject ads-txt-crawler "0.0.1"
  :description ""
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [clojurewerkz/urly "1.0.0"]
                 ;; [http-kit "2.2.0"]
                 [http-kit "2.3.0-alpha4"]]
  :target-path "target/%s"
  :profiles {:uberjar {:uberjar-name "ads-txt-crawler-standalone.jar" :aot :all}}
  :main ^:skip-aot ads-txt-crawler.core)
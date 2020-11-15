(defproject com.bradlucas/adstxt-crawler "0.0.9"
  :description "An implementation of a crawler for Ads.txt files written in Clojure"
  :url "https://github.com/bradlucas/adstxt-crawler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.cli "0.3.5"]
                 [clojurewerkz/urly "1.0.0"]
                 [http-kit "2.3.0-alpha4"]
                 [org.clojure/java.jdbc "0.7.2"]
                 [org.xerial/sqlite-jdbc "3.20.0"]]
  :target-path "target/%s"
  :profiles {:uberjar {:uberjar-name "adstxt-crawler-standalone.jar" :aot :all}}
  :deploy-repositories [["releases" {:url "https://clojars.org/repo"
                                   :creds :gpg}]]
  :main ^:skip-aot adstxt-crawler.core)

(defproject overtone-play "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [overtone "0.10.3"]]
  :main ^:skip-aot overtone-play.core
  :native-path "native"
  :target-path "target/%s"
  :jvm-opts ^:replace []
  :profiles {:uberjar {:aot :all}}
  :repl-options {:timeout 120000
                 :nrepl-middleware [cider.nrepl/wrap-apropos
                                    cider.nrepl/wrap-classpath
                                    cider.nrepl/wrap-complete
                                    cider.nrepl/wrap-debug
                                    cider.nrepl/wrap-format
                                    cider.nrepl/wrap-info
                                    cider.nrepl/wrap-inspect
                                    cider.nrepl/wrap-macroexpand
                                    cider.nrepl/wrap-ns
                                    cider.nrepl/wrap-spec
                                    cider.nrepl/wrap-pprint
                                    cider.nrepl/wrap-pprint-fn
                                    cider.nrepl/wrap-profile
                                    cider.nrepl/wrap-refresh
                                    cider.nrepl/wrap-resource
                                    cider.nrepl/wrap-stacktrace
                                    cider.nrepl/wrap-test
                                    cider.nrepl/wrap-trace
                                    cider.nrepl/wrap-out
                                    cider.nrepl/wrap-undef
                                    cider.nrepl/wrap-version]}
  :plugins [[cider/cider-nrepl "0.18.0"]
            [refactor-nrepl "2.4.0"]])

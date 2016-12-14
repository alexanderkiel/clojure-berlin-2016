(ns clojure-berlin-2016.core
  (:require [aleph.http :as http]
            [clojure.core.async :refer [<!! chan]]))

(defn -main [& args]
  (-> (fn [_]
        {:status 200
         :body "Clojure Berlin 2016"})
      (http/start-server {:port 8080}))
  (<!! (chan)))

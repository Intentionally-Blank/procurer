(ns procurer.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [procurer.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[procurer started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[procurer has shut down successfully]=-"))
   :middleware wrap-dev})

(ns procurer.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[procurer started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[procurer has shut down successfully]=-"))
   :middleware identity})

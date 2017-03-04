(ns user
  (:require [mount.core :as mount]
            [procurer.figwheel :refer [start-fw stop-fw cljs]]
            procurer.core))

(defn start []
  (mount/start-without #'procurer.core/http-server
                       #'procurer.core/repl-server))

(defn stop []
  (mount/stop-except #'procurer.core/http-server
                     #'procurer.core/repl-server))

(defn restart []
  (stop)
  (start))



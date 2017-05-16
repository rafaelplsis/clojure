(ns user
  (:require [mount.core :as mount]
            my-app.core))

(defn start []
  (mount/start-without #'my-app.core/repl-server))

(defn stop []
  (mount/stop-except #'my-app.core/repl-server))

(defn restart []
  (stop)
  (start))



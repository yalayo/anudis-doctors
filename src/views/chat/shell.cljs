(ns views.chat.shell
  (:require [re-frame.core :as re-frame]
            [views.chat.search :refer [search-component]]))

(defn shell-component []
  [:div {:id "chat-container"}
   [search-component]])


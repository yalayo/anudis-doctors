(ns views.chat.title
  (:require [re-frame.core :as re-frame]))

(defn title-component []
  [:div {:id "chat-title"}
   [:span "Daryl Duckmanton"]
   [:img {:src "../images/icons/trash-logo.svg" :alt "Delete Conversation"}]])

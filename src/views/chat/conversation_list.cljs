(ns views.chat.conversation-list
  (:require [re-frame.core :as re-frame]))

(defn conversation-list-component []
  [:div {:id "conversation-list"}
   [:div.conversation.active
    [:img {:src "../images/profiles/daryl.png" :alt "Daryl Duckmanton"}]
    [:div.title-text "Daryl Duckmanton"]
    [:div.created-date "Apr 16"]
    [:div.conversation-message "This is a message"]]])

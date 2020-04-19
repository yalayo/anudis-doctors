(ns views.chat.new-conversation
  (:require [re-frame.core :as re-frame]))

(defn new-conversation-component []
  [:div {:id "new-message-container"}
   [:span "+"]])

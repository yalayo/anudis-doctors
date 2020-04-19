(ns views.chat.shell
  (:require [re-frame.core :as re-frame]
            [views.chat.search :refer [search-component]]
            [views.chat.conversation-list :refer [conversation-list-component]]
             [views.chat.new-conversation :refer [new-conversation-component]]
             [views.chat.title :refer [title-component]]))

(defn shell-component []
  [:div {:id "chat-container"}
   [search-component]
   [conversation-list-component]
   [new-conversation-component]
   [title-component]])


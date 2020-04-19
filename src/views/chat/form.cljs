(ns views.chat.form
  (:require [re-frame.core :as re-frame]))

(defn form-component []
  [:div {:id "chat-form"}
   [:img {:src "../images/icons/attachment-logo.svg" :alt "Add Attachment"}]
   [:input {:type "text" :placeholder "type a message"}]])

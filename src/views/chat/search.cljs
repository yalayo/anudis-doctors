(ns views.chat.search
  (:require [re-frame.core :as re-frame]))

(defn search-component []
  [:div {:id "search-container"}
   [:input {:type "text" :placeholder "Search"}]])


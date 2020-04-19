(ns views.chat.conversation-list-test
  (:require [views.chat.conversation-list :refer [conversation-list-component]]
            [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
  [conversation-list-component])

(defcard-rg search
  [:div
   [:h1 [:i "Initial state"]]
   [show-component]])

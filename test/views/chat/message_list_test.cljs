(ns views.chat.message-list-test
  (:require [views.chat.message-list :refer [message-list-component]]
            [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
  [message-list-component])

(defcard-rg search
  [:div
   [:h1 [:i "Initial state"]]
   [show-component]])

(ns views.chat.new-conversation-test
  (:require [views.chat.new-conversation :refer [new-conversation-component]]
            [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
  [new-conversation-component])

(defcard-rg search
  [:div
   [:h1 [:i "Initial state"]]
   [show-component]])

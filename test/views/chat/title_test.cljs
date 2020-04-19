(ns views.chat.title-test
  (:require [views.chat.title :refer [title-component]]
            [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
  [title-component])

(defcard-rg search
  [:div
   [:h1 [:i "Initial state"]]
   [show-component]])

(ns views.chat.search-test
  (:require [views.chat.search :refer [search-component]]
            [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
  [search-component])

(defcard-rg search
  [:div
   [:h1 [:i "Initial state"]]
   [show-component]])

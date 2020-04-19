(ns views.chat.form-test
  (:require [views.chat.form :refer [form-component]]
            [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
  [form-component])

(defcard-rg search
  [:div
   [:h1 [:i "Initial state"]]
   [show-component]])

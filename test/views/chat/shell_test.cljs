(ns views.chat.shell-test
  (:require [views.chat.shell :refer [shell-component]]
            [clojure.spec.alpha :as s]
            [clojure.test.check.generators :as gen]
            [devcards.core :refer-macros [defcard defcard-rg]]))

(defn- show-component []
    [shell-component])

(defcard-rg shell
  [:div
   [:h1 [:i "Initial state"]]
   [show-component]])


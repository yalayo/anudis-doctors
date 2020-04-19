(ns views.chat.message-list
  (:require [re-frame.core :as re-frame]))

(defn message-list-component []
  [:div {:id "chat-message-list"}
   [:div.message-row.you-message
    [:div.message-content
     [:div.message-text "Ok then"]
     [:div.message-time "Apr 16"]]]

   [:div.message-row.other-message
    [:div.message-content
     [:div.message-text "Yeah I think it's best we do that. Otherwise things won't work well at all. 
                        I'm adding more text here to test the sizing of the speech bubble and the 
                        wrapping of it too."]
     [:div.message-time "Apr 16"]]]

   [:div.message-row.you-message
    [:div.message-content
     [:div.message-text "Maybe we can use Jim's studio."]
     [:div.message-time "Apr 15"]]]

   [:div.message-row.other-message
    [:div.message-content
     [:div.message-text "All I know is where I live it's too hard
                        to record because of all the street noise."]
     [:div.message-time "Apr 15"]]]

   [:div.message-row.you-message
    [:div.message-content
     [:div.message-text "Well we need to work out sometime soon where
                        we really want to record our video course."]
     [:div.message-time "Apr 15"]]]

   [:div.message-row.other-message
    [:div.message-content
     [:div.message-text "I'm just in the process of finishing off the
                        last pieces of material for the course."]
     [:div.message-time "Apr 14"]]]

   [:div.message-row.you-message
    [:div.message-content
     [:div.message-text "How's it going?"]
     [:div.message-time "Apr 13"]]]

   [:div.message-row.other-message
    [:div.message-content
     [:div.message-text "Hey mate what's up?"]
     [:div.message-time "Apr 13"]]]

   [:div.message-row.you-message
    [:div.message-content
     [:div.message-text "Hey Daryl?"]
     [:div.message-time "Apr 13"]]]])

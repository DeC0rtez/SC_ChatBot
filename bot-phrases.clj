;the following are phrases which the bot will print before also returning the relevant information.
    (def phrases {
        :food_true {
            :p1 "Dining is available at this park."
            :p2 "Don't worry, you will not go hungry at this park!"
            :p3 "Yes! I know just the place for you to go eat!"
        }
        :food_false {
            :p1 "Unfortunately, there are no restaurants at this park."
            :p2 "While there are no restaurants at the park, you are sure to find some nearby."
            :p3 "There currently are no restaurants here, but why not head there anyway and have a picnic?"
        }
        :toilet_true {
            :p1 "This park has toilets."
            :p2 "Restrooms are available to visitors at this park."
            :p3 "Toilets are available at this park."
        }
        :toilet_false {
            :p1 "Unfortunately, there are no toilets here."
            :p2 "Toilets are currently not available at this location"
            :p3 "There are no restrooms at this park"
        }
        :POI_true {
            :p1 "There are many things to do and see at this location!"
            :p2 "There is a lot to discover and explore at this park. Get ready for an adventure!"
            :p3 "You won't be bored here, there is a lot to do!"
        }
        :bike_path_true {
            :p1 "The park has bicycle paths."
            :p2 "You can head there on your bike. Make sure to wear a helmet!"
            :p3 "This location is perfect for an enjoyable cycling session. Ride safe!"
        }
        :bike_path_false {
            :p1 "Unfortunately, cycling is not permitted at this location."
            :p2 "While you may not come here on your bike, we recommend a relaxing ride along the river bank"
            :p3 "You won't be able to cycle at this park."
        }
        :skating_true {
            :p1 "Yes, you may skate in this park."
            :p2 "This park is suitable for skating."
            :p3 "Yes. Skate away!"
        }
        :skating_false {
            :p1 "Unfortunately, skating is not permitted at this park."
            :p2 "While skating is not possible at this location, we recommend skating along the river bank"
            :p3 "This park does not allow skating."
        }
        :sports_field_true {
            :p1 "Yes. Sports facilities are open to the public."
            :p2 "This park offers you a good opportunity to exercise."
            :p3 "There are opportunities to challenge yourself physically at this park."
        }
        :sports_field_false {
            :p1 "Unfortunately, there are no sports facilities here. Do have a look in the surrounding area though, Prague has much to offer."
            :p2 "There are no sports facilities here, but why not go anyway and relax in the nature?"
            :p3 "There are no specialized sporting grounds here. You can still go there for a run though!"
        }
        :playground_true {
            :p1 "Yes, this location offers a playground. Your children will not be bored here."
            :p2 "Yes, there is a playground here. This park is the perfect place to watch your children play."
            :p3 "This park provides a playground for your children to entertain themselves at."
        }
        :playground_false {
            :p1 "Unfortunately, there isn't a playground at this location."
            :p2 "There are no playgrounds here. Make sure to reward your children with a snack if you bring them along."
            :p3 "There currently isn't a playground there."
        }
        :public_transport_true {
            :p1 "You can travel to this park by public transport easily!"
            :p2 "Yes, here are some ways to get there by public transport."
            :p3 "Don't worry, hop on a tram or bus, you will be there in no time."
        }
        :public_transport_false {
            :p1 "Unfortunately, this location is not reachable by public transport."
            :p2 "While not accessible by public transport, why not consider taking a Uber?"
            :p3 "This park is a bit out of hand. Consider alternatives to public transport."
        }
        :parking_true {
            :p1 "Parking is available at this location."
            :p2 "You may park there, feel free to drive."
            :p3 "Yes, parking is available at the park."
        }
        :parking_false {
            :p1 "Unfortunately, parking is not available at the location."
            :p2 "Since parking is not available here, why not consider Prague's modern public transport?"
            :p3 "Parking is not possible at this location."
        }
        :dogs_true {
            :p1 "Yes, do not hesitate to bring your four-legged friend with you."
            :p2 "Yes, dogs are permitted in the park."
            :p3 "You may bring your dog here. Remember to keep them on a leash."
        }
        :dogs_false {
            :p1 "Unfortunately, dogs are not permitted at this location."
            :p2 "This park does not tolerate dogs, consider some of the others."
            :p3 "I am afraid your dog won't be able to accompany you to this park."
        }
    }
    )
;the get_reponse function takes the phrase category "p_cat" (such as :food_true) as an input and returns a randomly selected phrase from that category.
;it shall be called from within the loop when user input is scanned for keywords.
(defn get_response [p_cat]
    (def rn (rand-int 4))
    (cond
        (= rn 1) (println (:p1 (p_cat phrases)))
        (= rn 2) (println (:p2 (p_cat phrases)))
        :else (println (:p3 (p_cat phrases)))))

;Below is outdated code kept for testing and safekeeping in case of need.
;They shall be called from within the loop when user input is scanned for keywords.

;    (defn r_food_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:food_true phrases)))
;             (= rn 2) (println (:p2 (:food_true phrases)))
;             :else (println (:p3 (:food_true phrases)))))

;     (defn r_food_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:food_false phrases)))
;             (= rn 2) (println (:p2 (:food_false phrases)))
;             :else (println (:p3 (:food_false phrases)))))

;     (defn r_toilet_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:toilet_true phrases)))
;             (= rn 2) (println (:p2 (:toilet_true phrases)))
;             :else (println (:p3 (:toilet_true phrases)))))

;     (defn r_toilet_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:toilet_false phrases)))
;             (= rn 2) (println (:p2 (:toilet_false phrases)))
;             :else (println (:p3 (:toilet_false phrases)))))

;     (defn r_POI_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:POI_true phrases)))
;             (= rn 2) (println (:p2 (:POI_true phrases)))
;             :else (println (:p3 (:POI_true phrases)))))

;     (defn r_bike_path_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:bike_path_true phrases)))
;             (= rn 2) (println (:p2 (:bike_path_true phrases)))
;             :else (println (:p3 (:bike_path_true phrases)))))  

;     (defn r_bike_path_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:bike_path_false phrases)))
;             (= rn 2) (println (:p2 (:bike_path_false phrases)))
;             :else (println (:p3 (:bike_path_false phrases)))))

;     (defn r_skating_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:skating_true phrases)))
;             (= rn 2) (println (:p2 (:skating_true phrases)))
;             :else (println (:p3 (:skating_true phrases)))))

;     (defn r_skating_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:skating_false phrases)))
;             (= rn 2) (println (:p2 (:skating_false phrases)))
;             :else (println (:p3 (:skating_false phrases)))))

;     (defn r_sports_field_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:sports_field_true phrases)))
;             (= rn 2) (println (:p2 (:sports_field_true phrases)))
;             :else (println (:p3 (:sports_field_true phrases)))))

;     (defn r_sports_field_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:sports_field_false phrases)))
;             (= rn 2) (println (:p2 (:sports_field_false phrases)))
;             :else (println (:p3 (:sports_field_false phrases)))))

;     (defn r_playground_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:playground_true phrases)))
;             (= rn 2) (println (:p2 (:playground_true phrases)))
;             :else (println (:p3 (:playground_true phrases)))))

;     (defn r_playground_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:playground_false phrases)))
;             (= rn 2) (println (:p2 (:playground_false phrases)))
;             :else (println (:p3 (:playground_false phrases)))))

;     (defn r_public_transport_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:public_transport_true phrases)))
;             (= rn 2) (println (:p2 (:public_transport_true phrases)))
;             :else (println (:p3 (:public_transport_true phrases)))))

;     (defn r_public_transport_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:public_transport_false phrases)))
;             (= rn 2) (println (:p2 (:public_transport_false phrases)))
;             :else (println (:p3 (:public_transport_false phrases)))))

;     (defn r_parking_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:parking_true phrases)))
;             (= rn 2) (println (:p2 (:parking_true phrases)))
;             :else (println (:p3 (:parking_true phrases)))))

;     (defn r_parking_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:parking_false phrases)))
;             (= rn 2) (println (:p2 (:parking_false phrases)))
;             :else (println (:p3 (:parking_false phrases)))))

;     (defn r_dogs_true []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:dogs_true phrases)))
;             (= rn 2) (println (:p2 (:dogs_true phrases)))
;             :else (println (:p3 (:dogs_true phrases)))))

;     (defn r_dogs_false []
;         (def rn (rand-int 4))
;         (cond
;             (= rn 1) (println (:p1 (:dogs_false phrases)))
;             (= rn 2) (println (:p2 (:dogs_false phrases)))
;             :else (println (:p3 (:dogs_false phrases)))))


;---alternative structure experimentation, not used for now.---
;(def p1 "Hello")
;(def p2 "Hi")
;(def p3 "Hey")
;(def greetings [p1 p2 p3])
;(println (rand-nth greetings))
(def phrases_true {
        :food {
            :p1 "Dining is available at this park."
            :p2 "Don't worry, you will not go hungry at this park!"
            :p3 "Yes! I know just the place for you to go eat!"
        }
      
        :toilet {
            :p1 "This park has toilets."
            :p2 "Restrooms are available to visitors at this park."
            :p3 "Toilets are available at this park."
        }
     
        :POI {
            :p1 "There are many things to do and see at this location!"
            :p2 "There is a lot to discover and explore at this park. Get ready for an adventure!"
            :p3 "You won't be bored here, there is a lot to do!"
        }
        :bike_path {
            :p1 "The park has bicycle paths."
            :p2 "You can head there on your bike. Make sure to wear a helmet!"
            :p3 "This location is perfect for an enjoyable cycling session. Ride safe!"
        }
     
        :skating {
            :p1 "Yes, you may skate in this park."
            :p2 "This park is suitable for skating."
            :p3 "Yes. Skate away!"
        }
    
        :sports_field {
            :p1 "Yes. Sports facilities are open to the public."
            :p2 "This park offers you a good opportunity to exercise."
            :p3 "There are opportunities to challenge yourself physically at this park."
        }
 
        :playground {
            :p1 "Yes, this location offers a playground. Your children will not be bored here."
            :p2 "Yes, there is a playground here. This park is the perfect place to watch your children play."
            :p3 "This park provides a playground for your children to entertain themselves at."
        }

        :public_transport {
            :p1 "You can travel to this park by public transport easily!"
            :p2 "Yes, here are some ways to get there by public transport."
            :p3 "Don't worry, hop on a tram or bus, you will be there in no time."
        }

        :parking {
            :p1 "Parking is available at this location."
            :p2 "You may park there, feel free to drive."
            :p3 "Yes, parking is available at the park."
        }

        :dogs {
            :p1 "Yes, do not hesitate to bring your four-legged friend with you."
            :p2 "Yes, dogs are permitted in the park."
            :p3 "You may bring your dog here. Remember to keep them on a leash."
        }})

(def phrases_false {
        :food {
            :p1 "Unfortunately, there are no restaurants at this park."
            :p2 "While there are no restaurants at the park, you are sure to find some nearby."
            :p3 "There currently are no restaurants here, but why not head there anyway and have a picnic?"
        }

        :toilet {
            :p1 "Unfortunately, there are no toilets here."
            :p2 "Toilets are currently not available at this location"
            :p3 "There are no restrooms at this park"
        }

        :bike_path {
            :p1 "Unfortunately, cycling is not permitted at this location."
            :p2 "While you may not come here on your bike, we recommend a relaxing ride along the river bank"
            :p3 "You won't be able to cycle at this park."
        }

        :skating {
            :p1 "Unfortunately, skating is not permitted at this park."
            :p2 "While skating is not possible at this location, we recommend skating along the river bank"
            :p3 "This park does not allow skating."
        }

        :sports_field {
            :p1 "Unfortunately, there are no sports facilities here. Do have a look in the surrounding area though, Prague has much to offer."
            :p2 "There are no sports facilities here, but why not go anyway and relax in the nature?"
            :p3 "There are no specialized sporting grounds here. You can still go there for a run though!"
        }

        :playground {
            :p1 "Unfortunately, there isn't a playground at this location."
            :p2 "There are no playgrounds here. Make sure to reward your children with a snack if you bring them along."
            :p3 "There currently isn't a playground there."
        }

        :public_transport {
            :p1 "Unfortunately, this location is not reachable by public transport."
            :p2 "While not accessible by public transport, why not consider taking a Uber?"
            :p3 "This park is a bit out of hand. Consider alternatives to public transport."
        }

        :parking {
            :p1 "Unfortunately, parking is not available at the location."
            :p2 "Since parking is not available here, why not consider Prague's modern public transport?"
            :p3 "Parking is not possible at this location."
        }

        :dogs {
            :p1 "Unfortunately, dogs are not permitted at this location."
            :p2 "This park does not tolerate dogs, consider some of the others."
            :p3 "I am afraid your dog won't be able to accompany you to this park."
        }})
;the get_reponse function takes the phrase category "p_cat" (such as :food_true) as an input and returns a randomly selected phrase from that category.
;it shall be called from within the loop when user input is scanned for keywords.
(defn get_response [p_coll p_cat]
    (def rn (rand-int 4))
    (cond
        (= rn 1) (println (:p1 (p_cat p_coll)))
        (= rn 2) (println (:p2 (p_cat p_coll)))
        :else (println (:p3 (p_cat p_coll)))))
;examples 
(get_response phrases_true :dogs)
(get_response phrases_false :dogs)
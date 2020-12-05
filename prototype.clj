(require '[clojure.string :as string])

(def Frantiskanska_Zahrada{
    ;---Basic Info---
    :food true
    :food_extra "In the vicinity - Alfa passage, Wenceslaus & Jungmann square, Narodni Trida"
    :toilet true
    :toilet_extra "with wheelchair access"
    :POIs "Pleasant dining in the historical town district, suitable for both children and the elderly, Church of Our Lady of the Snows"
    ;---Children and Sport---
    :bike_path true
    :skating false
    :sports_field false
    :sports_field_extra nil
    :playground true
    :playground_extra nil
    ;---Directions---
    :public_transport "
    stop: Wenceslaus Sq. - trams: #3, #9, #14, #24, #51, #52, #54, #55, #56, #58 
    stop: Můstek - metro line(s): A, B"
    :GPS_coords "50°4′58.8″ N, 14°25′24.8″ E"
    :parking false
    :parking_extra nil
    ;---Additional Information---
    :dogs false
    :path_type "paved, special surface in child playpen"
    :administered_by "Prague City"
    :opening_hours "Year long, closes at night"
    ;---Map---
    :map_url "https://www.praha.eu/public/50/c9/77/184207_4_frantiskanska_mapa.pdf"
})

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

        :POI {
            :p1 "Unfortunately, there are no attractions here."
            :p2 "There are no sights at this park, but you are still sure to enjoy the nature."
            :p3 "There are no tourist attraction at this park."
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

(def synonyms_food #{"eat", "dinner", "lunch", "breakfast", "food", "dine", "diner", "hunger", "hungry", "snack", "meal", "meals", "drink", "drinking", "drinks", "restaurant", "restaurants"})
(def synonyms_toilet #{"WC", "restroom", "restrooms", "bathroom", "toilets", "toilet", "WCs", "outhouse", "lavatory"})
(def synonyms_POI #{"attractions", "sights", "sight", "attraction", "activity", "activities", "tourist attraction", "tourist attractions"})

(def synonyms_bike #{"bike", "biking", "cycling", "cycle", "bicycle"})
(def synonyms_skating #{"Skate", "skate", "skates", "skating", "skater", "inline", "rollerblade", "rollerblades", "rollerblading"})
(def synonyms_sports #{"sport", "sports", "sporting", "exercise", "exercising", "work out", "workout" "working out", "exercises", "gym", "gyms", "athletic", "atheltics", "athlete", "football", "soccer", "tennis"})
(def synonyms_playground #{"play", "playground", "playing", "sandbox", "playpen"})
(def synonyms_public_transport #{"Bus", "bus", "Buses", "buses", "Metro", "metro", "Tram", "tram", "Trams", "trams", "MHD", "public transport", "public transportation"})
(def synonyms_coords #{"coordinates", "co-ordinates", "co-ords", "coords", "GPS", "gps"})
(def synonyms_parking #{"parking", "Parking", "park my car", "carpark", "car park", "parking ticket", "to park"})
(def synonyms_dogs #{"Dog", "dog", "doggo", "doggie", "pet", "dogs"})
(def synonyms_path #{"surface", "path", "pathway", "walkways", "paths", "pathways", "pavement", "pavements", "walkway", "trail", "trails", "footpath", "footpaths"})
(def synonyms_administration #{"responsible", "administration", "administered", "managed", "managing", "contact", "authority", "manager"})
(def synonyms_hours #{"time", "hours", "opening hours", "open", "close", "when", "how long", "closing", "opening"})
(def synonyms_map #{"map", "maps", "mapped", "overview"})

(defn contains_kwd? 
[syn_set str]
    (def lowerStr (string/lower-case str))
    (def amount 0)
    (doseq [key syn_set] 
        (if (string/includes? lowerStr key) 
            (def amount (+ amount 1)) nil))
    (if (> amount 0) true false)
)
(defn assign_keyword_category 
[keyword]
  (cond
    (contains_kwd? synonyms_food keyword) (def category :food)
    (contains_kwd? synonyms_toilet keyword) (def category :toilet)
    (contains_kwd? synonyms_POI keyword) (def category :POI)
    (contains_kwd? synonyms_bike keyword) (def category :bike_path)
    (contains_kwd? synonyms_skating keyword) (def category :skating)
    (contains_kwd? synonyms_sports keyword) (def category :sports_field)
    (contains_kwd? synonyms_playground keyword) (def category :playground)
    (contains_kwd? synonyms_public_transport keyword) (def category :public_transport)
    (contains_kwd? synonyms_coords keyword) (def category :GPS_coords)
    (contains_kwd? synonyms_parking keyword) (def category :parking)
    (contains_kwd? synonyms_dogs keyword) (def category :dogs)
    (contains_kwd? synonyms_path keyword) (def category :path_type)
    (contains_kwd? synonyms_administration keyword) (def category :administered_by)
    (contains_kwd? synonyms_hours keyword) (def category :opening_hours)
    (contains_kwd? synonyms_map keyword) (def category :map_url)
    :else (println "This is an incorrect input"))
  (println "Category is: " category))

(defn check_cat_bool 
[park bool]
  (cond
        (= (park bool) true) (def checked_bool true)
        (= (park bool) false) (def checked_bool false)
        :else (println "Not a boolean"))
  (println "checked bool is: " checked_bool))


(defn get_response [p_coll p_cat]
    (def rn (rand-int 4))
    (cond
        (= rn 1) (println (:p1 (p_cat p_coll)))
        (= rn 2) (println (:p2 (p_cat p_coll)))
        :else (println (:p3 (p_cat p_coll)))))

(defn prototype ;prototype chatbot which has a greeting message, takes user input and based on it returns a response. User input is taken in a loop until 'stop' is typed - then bot stops the loop.
[] ; no args
  (println "Hi, I am a park guide chatbot specialized in information about FrantiskanskaZahrada. Please ask me about Frantiskanska Zahrada, I will do my best to asnwer any questions you might have.") ;1st welcome message
  (loop [input (read-line)] ;takes user input, stores it in variable
    (if (= input "stop") ;checks user input, if "stop, ends loop"
      (do
         (println "Thank you and see you next time!")) ;prints message if user input is "stop", no more recursion, ends the loop
      (do
        (println "You typed: " input)
        (assign_keyword_category input)
        (check_cat_bool Frantiskanska_Zahrada category)
        (cond
           (and (= category :food) (= checked_bool false)) (get_response phrases_false :food)
           (and (= category :food) (= checked_bool true)) (get_response phrases_true :food)
           (and (= category :toilet) (= checked_bool false)) (get_response phrases_false :toilet)
           (and (= category :toilet) (= checked_bool true)) (get_response phrases_true :toilet)
           (and (= category :POI) (= checked_bool false)) (get_response phrases_false :POI)
           (and (= category :POI) (= checked_bool true)) (get_response phrases_true :POI)
           (and (= category :bike_path) (= checked_bool false)) (get_response phrases_false :bike_path)
           (and (= category :bike_path) (= checked_bool true)) (get_response phrases_true :bike_path)
           (and (= category :skating) (= checked_bool false)) (get_response phrases_false :skating)
           (and (= category :skating) (= checked_bool true)) (get_response phrases_true :skating)
           (and (= category :sports_field) (= checked_bool false)) (get_response phrases_false :sports_field)
           (and (= category :sports_field) (= checked_bool true)) (get_response phrases_true :sports_field)
           (and (= category :playground) (= checked_bool false)) (get_response phrases_false :playground)
           (and (= category :playground) (= checked_bool true)) (get_response phrases_true :playground)
           (and (= category :public_transport) (= checked_bool false)) (get_response phrases_false :public_transport)
           (and (= category :public_transport) (= checked_bool true)) (get_response phrases_true :public_transport)
           (and (= category :parking) (= checked_bool false)) (get_response phrases_false :parking)
           (and (= category :parking) (= checked_bool true)) (get_response phrases_true :parking)
           (and (= category :dogs) (= checked_bool false)) (get_response phrases_false :dogs)
           (and (= category :dogs) (= checked_bool true)) (get_response phrases_true :dogs)
           :else (println "This has no boolean"))
        (recur (read-line))) ;repeats loop aka recursion, takes new input, repeats process
      )
    )
  ) 
(prototype)

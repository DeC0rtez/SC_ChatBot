(require '[clojure.string :as string])

(def Bertramka{
    ;---Basic Info---
    :food nil
    :food_extra nil
    :toilet true
    :toilet_extra nil
    :POIs "Cultural monument, classical music concerts, social events, W.A. Mozart Museum" ;POI refers to Point of Interest
    ;---Children and Sport---
    :bike_path true
    :skating false
    :sports_field false
    :sports_field_extra nil
    :playground false
    :playground_extra nil
    ;---Directions---
    :public_transport "
    stop: Bertramka - trams: #4, #7, #9, #10, #58, #59"
    :GPS_coords "50°4′15.00″ N, 14°23′42.00″ E"
    :parking true
    :parking_extra "OC Smíchov underground parking"
    ;---Additional Information---
    :dogs nil
    :path_type "paved"
    :administered_by "Prague 5 & Comenius Company"
    :opening_hours "April-October: 09:00-18:00, November-March: 09:30-16:00"
    ;---Map---
    :map_url "https://www.praha.eu/public/fe/bd/6a/184189_4_bertramka_mapa.pdf"
})

(def phrases { ;example phrases
        :dogs {
            :p1 "Yes, do not hesitate to bring your four-legged friend with you."
            :p2 "Yes, dogs are permitted in the park."
            :p3 "You may bring your dog here. Remember to keep them on a leash."}
        :food {
            :p1 "Dining is available at this park."
            :p2 "Don't worry, you will not go hungry at this park!"
            :p3 "Don't worry, you will not go hungry at this park!"}})

(def synonyms_dogs #{"Dog", "dog", "doggo", "doggie", "pet"})
(def synonyms_food #{"eat", "dinner", "lunch", "breakfast", "food", "dine", "diner", "hunger", "hungry", "snack", "meal", "meals", "drink", "drinkings", "drinks"})

(defn assign_keyword_category 
[str]
  (def lowerStr (string/lower-case str))
  (def dogs 0)
  (def food 0)
  (doseq [key synonyms_dogs] 
    (if (string/includes? lowerStr key) 
    (def dogs (+ dogs 1)) nil))
  (doseq [key synonyms_food] 
    (if (string/includes? lowerStr key) 
    (def food (+ food 1)) nil))
   (if (> dogs food) (def category "dogs") (def category "food"))
  (println "Category is: " category)
category)
; (println (assign_keyword_category "Go eat some food boy"))

(defn get_response [p_cat] ;get response function that fetches a random response based on keyword
    (def rn (rand-int 4))
    (cond
        (= rn 1) (println (:p1 (p_cat phrases)))
        (= rn 2) (println (:p2 (p_cat phrases)))
        :else (println (:p3 (p_cat phrases)))))

(defn prototype ;prototype chatbot which has a greeting message, takes user input and based on it returns a response. User input is taken in a loop until 'stop' is typed - then bot stops the loop.
[] ; no args
  (println "Hi, I am a Bertramka park guide chatbot. Please ask me about food or dogs at Bertramka. (your input must include words 'food' or 'dogs').") ;1st welcome message
  (loop [input (read-line)] ;takes user input, stores it in variable
    (if (= input "stop") ;checks user input, if "stop, ends loop"
      (do
         (println "Thank you and see you next time!")) ;prints message if user input is "stop", no more recursion, ends the loop
      (do
        (println "You typed: " input)
        (assign_keyword_category input)
        (cond
           (= category :dogs) (get_response :dogs)
           (= category :food) (get_response :food)
           :else (println "This is an incorrect input"))
        (recur (read-line))) ;repeats loop aka recursion, takes new input, repeats process
      )
    )
  ) 
(prototype)

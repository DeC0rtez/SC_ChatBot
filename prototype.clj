(require '[clojure.string :as string])

(def phrases {
        :dogs {
            :p1 "Yes, do not hesitate to bring your four-legged friend with you."
            :p2 "Yes, dogs are permitted in the park."
            :p3 "You may bring your dog here. Remember to keep them on a leash."}
        :food {
            :p1 "Dining is available at this park."
            :p2 "Don't worry, you will not go hungry at this park!"
            :p3 "Don't worry, you will not go hungry at this park!"}
            
            
            
            
            })

(defn get_response [p_cat]
    (def rn (rand-int 4))
    (cond
        (= rn 1) (println (:p1 (p_cat phrases)))
        (= rn 2) (println (:p2 (p_cat phrases)))
        :else (println (:p3 (p_cat phrases)))))



(defn prototype 
[] ; no args
  (println "Hi, I am a Bertramka park guide chatbot. Please ask me about food or dogs at Bertramka. (your input must include words 'food' or 'dogs').") ;1st welcome message
  (loop [input (read-line)] ;takes user input, stores it in variable
    (if (= input "stop") ;checks user input, if "stop, ends loop"
      (do
         (println "Thank you and see you next time!")) ;prints message if user input is "stop", no more recursion, ends the loop
      (do
        (println "You typed: " input)
        (cond
           (= input "dogs") (get_response :dogs)
           (= input "food") (get_response :food)
           :else (println "This is an incorrect input"))
        (recur (read-line))) ;repeats loop aka recursion, takes new input, repeats process
      )
    )
  ) 
(prototype)
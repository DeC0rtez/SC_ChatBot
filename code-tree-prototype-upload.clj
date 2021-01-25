(require '[clojure.string :as string])

(defn contains_kwd? ;Nikita's function
[syn_set str]
    (def lowerStr (string/lower-case str))
    (def amount 0)
    (doseq [key syn_set]
        (if (string/includes? lowerStr key)
            (def amount (+ amount 1)) nil))
    (if (> amount 0) true false))

(def synonyms_yes #{"yes","yeah","yep","mhm","sure"})


(defn prototype_tree []

  (println "This part of the chatbot will try to identify the breed of a dog, [username here].")
  (println "By your estimate, was the dog you saw taller than 40 centimeters, or no?") ;layer 1a
  (def reply (read-line))

  (if
    (= (contains_kwd? synonyms_yes reply) true)
    ((println "Okay, cool. Did the dog resemble a wolf?") ;layer 2a
      (def reply (read-line))

      (if
        (= (contains_kwd? synonyms_yes reply) true)
        ((println "Got it. One more question: did it have white or grey fur?") ;layer 3a
          (def reply (read-line))

          (if
            (= (contains_kwd? synonyms_yes reply) true)
            (println "It probably was a Siberian husky.") ;finish
            (println "It probably was a German shepherd."))) ;finish

        ((println "Got it. Did it have curly fur?") ;layer 3b
          (def reply (read-line))

          (if
            (= (contains_kwd? synonyms_yes reply) true)
            (println "It probably was a poodle.") ;finish
            ((println "One last question. Was its fur short?") ;layer 4a
              (def reply (read-line))

              (if
                (= (contains_kwd? synonyms_yes reply) true)
                (println "It probably was a labrador.") ;finish
                (println "It probably was a golden retriever."))))))) ;finish

    ((println "Alright, got it. Did it have long fur?") ;layer 2b
      (def reply (read-line))

      (if
        (= (contains_kwd? synonyms_yes reply) true)
        (println "It probably was a Yorkshire terrier.") ;finish
        ((println "Okay, great. One more question: did the dog have a muscular build?") ;layer 3c
          (def reply (read-line))

          (if
            (= (contains_kwd? synonyms_yes reply) true)
            (println "It probably was a bulldog.") ;finish
            (println "It probably was a chihuahua."))))))) ;finish

(prototype_tree)

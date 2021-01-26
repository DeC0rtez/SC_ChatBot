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
(def synonyms_deciduous #{"deciduous","large","normal"})


(defn dog_tree []

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

(defn tree_tree []

  (println "This part of the chatbot will try to identify the 8 most common trees in Czech nature, [username here].")
  (println "Is the tree deciduous or coniferous? Coniferous trees have many small, spiky leaves which do not shed in the winter.") ;layer 1a
  (def reply (read-line))

  (if
    (= (contains_kwd? synonyms_deciduous reply) true)
    ((println "Is the tree's leaf shown on the Canadian national flag?") ;layer 2a
      (def reply (read-line))

      (if
        (= (contains_kwd? synonyms_yes reply) true)
        ((println "Ah! That must be a Sycamore Maple tree then, eh?") ;layer 3a
          (def reply (read-line))) ;finish

        ((println "Got it. Ddoes it have white bark?") ;layer 3b
          (def reply (read-line))

          (if
            (= (contains_kwd? synonyms_yes reply) true)
            (println "Must be a Silver Birch!") ;finish
            ((println "Alright, hmmm... Are squirrels known to eat its nuts?") ;layer 4a
              (def reply (read-line))

              (if
                (= (contains_kwd? synonyms_yes reply) true)
                (println "Squirrels like to munch on acorns, which grow on Oak trees. It must be an English Oak!") ;finish
                (println "Then it is probably a European Beech - their nuts are spikey and thus not very apetizing."))))))) ;finish

    ((println "Alright. Do the tree's leaves have a silver color?") ;layer 2b
      (def reply (read-line))

      (if
        (= (contains_kwd? synonyms_yes reply) true)
        (println "Then that must be a Silver Fir.") ;finish
        ((println "Okay, hmmm...Did the tree have downward facing cones?") ;layer 3c
          (def reply (read-line))

          (if
            (= (contains_kwd? synonyms_yes reply) true)
            (println "By my estimation, that is a Norwegian Spruce tree. It is very commonly used as a christmas tree in the Czech Republic!")
            ((println "Okay. Another question about the cones - Are they coloured red?") ;layer 4a
              (def reply (read-line))

              (if
                (= (contains_kwd? synonyms_yes reply) true)
                (println "Red! Then that must be a European Red Pine tree.") ;finish
                (println "Well, by deduction, it must be a European Larch.")))))))))

(tree_tree)
(dog_tree)

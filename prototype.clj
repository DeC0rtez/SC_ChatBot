(require '[clojure.string :as string])

(def bertramka{
    ;---Basic Info---
    :food nil
    :food_extra nil
    :toilet true
    :toilet_extra nil
    :POI "Cultural monument, classical music concerts, social events, W.A. Mozart Museum" ;POI refers to Point of Interest
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

(def frantiskanska_zahrada{
    ;---Basic Info---
    :food true
    :food_extra "In the vicinity - Alfa passage, Wenceslaus & Jungmann square, Narodni Trida"
    :toilet true
    :toilet_extra "with wheelchair access"
    :POI "Pleasant dining in the historical town district, suitable for both children and the elderly, Church of Our Lady of the Snows"
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

(def obora_hvezda{
    ;---Basic Info---
    :food true
    :food_extra "During Summer Season on the premises of the Villa (www.pamatniknarodnihopisemnictvi.cz), tel:. +420 235 357 938,
    or at Libocká street, restaurant U Holečků, www.uholecku.cz,
    or at Libocká studna, tel. +420 777 836 966,
    alternatively at Petřiny"
    :toilet true
    :toilet_extra "Portable toilets on the premises, during summer season toilets are also available in the villa"
    :POI "Suitable for tourists and families with children, heritage trees, nature trail, natural attractions"
    ;---Children and Sport---
    :bike_path true
    :skating false
    :sports_field false
    :sports_field_extra "nearby: Youth House (www.ddmp6.cz/kontakt/) & traffic playground"
    :playground true
    :playground_extra "2 playgrounds"
    ;---Directions---
    :public_transport "
    stop: Nad Markétou - buses: #179, #184, #191, #510,
    stop: Libocká - buses: #179, #510,
    stop: Vypich - trams: #15, #22, #25, #57"
    :GPS_coords "50°5′2.798″ N, 14°19′45.529″ E"
    :parking true
    :parking_extra "8 parking spots at Libocká gate, free parking in U Hvězdy street"
    ;---Additional Information---
    :dogs false
    :path_type "Hardened soil, threshing floor"
    :administered_by "Museum of Czech Literature, Prague City"
    :opening_hours "park - year long, villa - (April 10:00-17:00, May-September 10:00-18:00, October 10:00-17:00, November-March CLOSED) "
    ;---Map---
    :map_url "https://www.praha.eu/public/bf/26/3e/184361_4_hvezda_mapa.pdf"
})

(def kampa{
    ;---Basic Info---
    :food true
    :food_extra "restaurant: Rybí Restaurace,
    café: Mlýnská (tel. +420 608 444 490)
    restaurant/café : Sovovy Mlýny"
    :toilet true
    :toilet_extra nil
    :POI "View of the river, Sovovy Mlýny gallery, Čertovka, Charles Bridge, Werich House, heritage trees"
    ;---Children and Sport---
    :bike_path true
    :skating true
    :sports_field false
    :sports_field_extra "no specialized sports facilities, but grass-covered segments available for sports"
    :playground true
    :playground_extra "yes, in the vicinity: Community and Maternal centre Kampa"
    ;---Directions---
    :public_transport "
    stop: Helichova - trams: #12, #20, #20, #22, #23, #57
    stop: Újezd - trams: #6, #9, #22, #23, #57, #58, #59"
    :GPS_coords "50°5′16.87″ N, 14°24′14.58″ E"
    :parking false
    :parking_extra nil
    ;---Additional Information---
    :dogs nil
    :path_type "asphalt"
    :administered_by "Municipality Prague 1, Prague City"
    :opening_hours "Open year-round"
    ;---Map---
    :map_url "https://www.praha.eu/public/7c/a6/ed/184308_4_kampa_mapa.pdf"
})

(def kinskeho_zahrada{
    ;---Basic Info---
    :food true
    :food_extra "café in Musaion museum of natural sciences"
    :toilet true
    :toilet_extra nil
    :POI "Enjoyable location for a walk with children, Quiet and relaxing space in the center of town, Musaion Museum of Natural Sciences, decorative ponds, natural attraction - Petřín rock formations"
    ;---Children and Sport---
    :bike_path false
    :skating false
    :sports_field false
    :sports_field_extra nil
    :playground true
    :playground_extra "yes, by the Kinských square entrance, nearby Kinských Villa and more under construction"
    ;---Directions---
    :public_transport "
    stop: Kobrova - bus: #176"
    :GPS_coords "50° 4′ 44.26″ N, 14° 24′ 0.21″ N"
    :parking true
    :parking_extra "OC Smíchov underground parking"
    ;---Additional Information---
    :dogs true
    :path_type "paved"
    :administered_by "Prague City"
    :opening_hours "Open year-round"
    ;---Map---
    :map_url "https://www.praha.eu/public/3/95/58/184325_4_kinskeho_mapa.pdf"
})

(def klamovka{
    ;---Basic Info---
    :food true
    :food_extra "restaurant & club Klamovka"
    :toilet true
    :toilet_extra "in the restaurant and club"
    :POI "Historically significant sights, art gallery, musical club with restaurant in garden, playground for small children"
    ;---Children and Sport---
    :bike_path true
    :skating false
    :sports_field true
    :sports_field_extra "Tennis courts and sports facilities in Sokolovna gymnasium"
    :playground true
    :playground_extra "by the garden restaurant"
    ;---Directions---
    :public_transport "
    stop: Klamovka - buses: #149, #191, #217, - trams: #4, #7, #9, #10, #58, #59"
    :GPS_coords "50°4′17,04″ N, 14°22′39,72″ E"
    :parking false
    :parking_extra nil
    ;---Additional Information---
    :dogs true
    :path_type "paved & asphalt"
    :administered_by "Municipality Prague 5"
    :opening_hours "Open year-round"
    ;---Map---
    :map_url "https://www.praha.eu/public/16/84/48/184296_4_klamovka_mapa.pdf"
})

(def ladronka{
        ;---Basic Info---
        :food true
        :food_extra "restaurant Ladronka"
        :toilet true
        :toilet_extra "in the restaurant"
        :POI "Large area suited for free time activities and relaxation for all age categories, year-long: musical performances and social events, suited for a day-long stay"
        ;---Children and Sport---
        :bike_path true
        :skating true
        :sports_field false
        :sports_field_extra "Not in the park itself, but nearby: traffic playfround and Vypich Youth House"
        :playground true
        :playground_extra "by the restaurant and by the Ladronka bus stop"
        ;---Directions---
        :public_transport "
        stop: U ladronky/ Rozýnova/ Štefkova - bus: #191
        stop: Vypich - buses: #108, #174, #180, #191, #I3, - trams: #15, 22, 25, 57"
        :GPS_coords "50°4′47.447″ N, 14°21′52.445″ E"
        :parking true
        :parking_extra "Yes, in streets Tomanova & Skokanská"
        ;---Additional Information---
        :dogs true
        :path_type "paved, threshing floor & asphalt"
        :administered_by "Municipality Prague 6"
        :opening_hours "Open year-round"
        ;---Map---
        :map_url "https://www.praha.eu/public/72/f3/b/184218_4_ladronka_mapa.pdf"
})

(def letna{
    ;---Basic Info---
    :food true
    :food_extra "Letenský estate (www.letenskyzamecek.cz), Hanavský pavilion (www.hanavskypavilon.cz) "
    :toilet true
    :toilet_extra "in the restaurants"
    :POI "Spacious area for free time activities, suitable for all age categories, year-long: cultural events, suited for a day-long stay"
    ;---Children and Sport---
    :bike_path true
    :skating true
    :sports_field false
    :sports_field_extra "Not in the park itself, however sports and recreational activities are permitted on grassy segments, additionally:
    2x skates rentals: Rental #1 - Skala sport tel. +420 605 258 670, Rental #2 - tel. +420 220 571 721
    General purpose rental: AC Sparta rental - tel. +420 603 938 328,
    small pitch for football, paid access tennis courts on premises of LTC Slavia - tel. +420 777 789 140"
    :playground true
    :playground_extra "4 in total. By the letenský estate, 2 by the tennis courts, one by Hanavský pavillion"
    ;---Directions---
    :public_transport "
        stop: Letenské Náměstí/ Sparta - trams: #1, #8, #15, #25, #26, #51, #56
        stop: Čechův most - trams: #12, #17, #53
        stop: Chotkovy Sady - trams: #18, #20, #57
        stop: Hradčanská - metro line(s): A"
    :GPS_coords "50°5′41″ N, 14°24′57″ E"
    :parking true
    :parking_extra "Yes, in Kostelní street"
    ;---Additional Information---
    :dogs true
    :path_type "asphalt"
    :administered_by "Prague City"
    :opening_hours "Open year-round"
    ;---Map---
    :map_url "https://www.praha.eu/public/e3/49/62/184240_4_letna_mapa.pdf"
})

(def petrin{
    ;---Basic Info---
    :food true
    :food_extra "Restaurants: Nebozízek, Petřínské terasy, Outlook Tower buffet, Peklo, Bella Vista"
    :toilet true
    :toilet_extra "in restaurants and by outlook tower"
    :POI "Suitable for tourists and families with small children, accessible on foot or by cablecar, Outlook tower, Mirror maze, Astronomy tower, Mineshafts, Fruit orchards"
    ;---Children and Sport---
    :bike_path true
    :skating true
    :sports_field false
    :sports_field_extra nil
    :playground true
    :playground_extra "by Hellichova street"
    ;---Directions---
    :public_transport "
        stop: Újezd - trams: #6, #9, #12, #20, #22, #23, #57, #58, #59
        stop: Hellichova - trams: #12, #20, #22, #23, #57
        stop: Pohořelec - trams: #22, #23
        stop: Koleje Strahov - buses: #143, #149, #217"
    :GPS_coords "50°05′2.93″ N, 14°23′40.88″ E"
    :parking true
    :parking_extra "by Strahov stadium"
    ;---Additional Information---
    :dogs nil
    :path_type "asphalt, concrete, paved, threshing floor"
    :administered_by "Prague City"
    :opening_hours "Petřín & Astronomy Station: open year-round
    Outlook tower: January-March, November - (10:00-18:00), April, September, October - (10:00-19:00), May-August - (10:00-22:00)"
    ;---Map---
    :map_url "https://www.praha.eu/public/d/77/d/184279_4_petrin_mapa.pdf"
})

(def riegrovy_sady{
    ;---Basic Info---
    :food true
    :food_extra "Restaurant: Versus (tel. +420 222 717 247)"
    :toilet true
    :toilet_extra "in restaurants and portable toilet by playground"
    :POI "1920s Outlook tower, 1840 monolith, Captivating view of Prague skyline"
    ;---Children and Sport---
    :bike_path true
    :skating true
    :sports_field true
    :sports_field_extra "Sokol Vinohrady"
    :playground true
    :playground_extra "yes, by the restaurant"
    ;---Directions---
    :public_transport "
    stop: Jiřího z Poděbrad metro line(s): C
    stop: Na Smetance - bus: #135
    stop: Italská - tram: #11
    stop: Vinohradská Tržnice - tram: #11"
    :GPS_coords "50°4′50.659″ N, 14°26′26.287″ E"
    :parking false
    :parking_extra nil
    ;---Additional Information---
    :dogs true
    :path_type "asphalt"
    :administered_by "Municipality Prague 2"
    :opening_hours "open year-round"
    ;---Map---
    :map_url "https://www.praha.eu/public/a3/62/48/184344_4_riegrovy_sady_mapa.pdf"
})

(def stromovka{
    ;---Basic Info---
    :food true
    :food_extra "restaurant Staročeská rychta na Výstavišti"
    :toilet true
    :toilet_extra "within nearby restaurants"
    :POI "Suitable for children and tourists, Prague ZOO and Botanic Garden nearby, Natural attractions, Štefáník Planet Observatory, Prague exhibition grounds"
    ;---Children and Sport---
    :bike_path true
    :skating true
    :sports_field true
    :sports_field_extra "tennis courts at TK Sparta Prague"
    :playground true
    :playground_extra "2 playgrounds"
    ;---Directions---
    :public_transport "
    stop: Výstaviště - trams: #5, #12, #14, #15, #17, #53, #54
    stop: Sibiřské náměstí - bus: #131
    stop: Rašínovo nábřeží - steamboat"
    :GPS_coords "50˚ 6′ 27.80″ N 14˚ 25′ 12.53″ E"
    :parking true
    :parking_extra "by the Exhibition grounds or in Bubeneč"
    ;---Additional Information---
    :dogs true
    :path_type "asphalt, threshing floor"
    :administered_by "Prague City"
    :opening_hours "open year-round"
    ;---Map---
    :map_url "https://www.praha.eu/public/9e/a/ad/184253_4_stromovka_web.pdf"
})

(def vysehrad{
    ;---Basic Info---
    :food true
    :food_extra "Café Citadela, Café na Hradbách, restuarant Rio´s Vyšehrad, restaurant U dělové koule (tel. +420 224 919 970)"
    :toilet true
    :toilet_extra nil
    :POI "Natural & Cultural heritage site, suitable for family trips with children, beautiful view of prague, musem, Slavín cemetary for significant persons"
    ;---Children and Sport---
    :bike_path true
    :skating false
    :sports_field true
    :sports_field_extra "tennis courts (tel. +420 606 650 717, +420 606 500 604)"
    :playground true
    :playground_extra "by St. Martin chapel, Mr. Trnka playpen, by entrance to Gorlice hall"
    ;---Directions---
    :public_transport "
    stop: Vyšehrad metro line(s): C
    stop: Podolská Vodárna - trams: #3, #16, #17, #21, #52"
    :GPS_coords "50°3′46.66″ N, 14°25′22.75″ E"
    :parking true
    :parking_extra "underground parking of Prague Congress Centre, or in Na Topolce street"
    ;---Additional Information---
    :dogs nil
    :path_type "paved, threshing floor"
    :administered_by "Natural Heritage Site - Prague City"
    :opening_hours "open year-round"
    ;---Map---
    :map_url "https://www.praha.eu/public/9e/b2/d0/184274_4_vysehrad_mapa.pdf"
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

;sets of words tied up to info categories
(def alt_food #{"eat","dinner","lunch","breakfast","food","dine","hungry","hunger","snack","meal","drink","restaraunt","cafe","bar","coffee","beer","wine","svarak","svařák"})
(def alt_toilet #{"wc","restroom","bathroom","toilet","outhouse","lavatory","latrine","water closet"})
(def alt_POI #{"sight", "attraction", "activity", "activities", "tourist","landmark","fun to do","interesting to do","interesting to see","exciting to do","exciting to see","monument"})
(def alt_bike #{"bike","biking","cycle","cycling"})
(def alt_skating #{"skate","skating","rollerblade","rollerblading"})
(def alt_sports #{"sport","exercise","work out","workout","working out","gym","athletic","soccer","tennis","ball","physical"})
(def alt_playground #{"playground","playpen","sandbox","child","kid"})
(def alt_public_transport #{"bus","metro","subway","tube","underground","tram","mhd","public transport","rapid transit","mass transit","get there","get here","travel"})
(def alt_coords #{"coordinates","co-ordinates","coords","co-ords","gps"})
(def alt_parking #{"car","automobile","parking","to park"})
(def alt_dogs #{"dog","pet","pup"})
(def alt_path #{"path","walkway","surface","pavement","trail"})
(def alt_administration #{"responsible","admin","manage","managing","authority","contact","in charge"})
(def alt_hours #{"time","hour","open","close","when","how long"})
(def alt_map #{"map","overview","where"})
;sets of alternative park names
(def alt_bertramka #{"Bertramka","bertramka"})
(def alt_frantiskanska_zahrada #{"Frantiskanska Zahrada","frantiskanska zahrada","Frantiskanska zahrada", "Františkánská Zahrada","františkánská zahrada","Františkánská zahrada"})
(def alt_obora_hvezda #{"Obora Hvezda","obora hvezda","Obora hvezda","Obora Hvězda","obora hvězda","Obora hvězda", "Hvězda", "hvězda", "letohrádek hvězda", "Letohrádek hvězda", "Letohrádek Hvězda", "letohrádek Hvězda", "letohradek hvezda", "Letohradek hvezda", "Letohradek Hvezda", "letohradek Hvezda", "hvezda", "Hvezda"})
(def alt_kampa #{"Kampa","kampa"})
(def alt_kinskeho_zahrada #{"Kinskeho Zahrada","kinskeho zahrada","Kinskeho zahrada","Kinského Zahrada","kinského zahrada","Kinského zahrada","Kinskeho Sady","kinskeho sady","Kinskeho sady","Kinského Sady","kinského sady","Kinského sady","Zahrada Kinskych","zahrada kinskych","Zahrada kinskych","Zahrada Kinských","zahrada kinských","Zahrada kinských"})
(def alt_klamovka #{"Klamovka","klamovka"})
(def alt_ladronka #{"Ladronka","ladronka"})
(def alt_letna #{"Letna","letna","Letná","letná"})
(def alt_petrin #{"Petrin","petrin","Petřín","petřín"})
(def alt_riegrovy_sady #{"Riegrovy Sady","riegrovy sady","Riegrovy sady"})
(def alt_stromovka #{"Stromovka","stromovka"})
(def alt_vysehrad #{"Vysehrad","vysehrad","Vyšehrad","vyšehrad"})

(def parks #{"frantiskanska_zahrada", "bertramka", "obora_hvezda", "kampa", "kinskeho_zahrada", "klamovka", "ladronka", "letna", "petrin", "riegrovy_sady", "stromovka", "vysehrad"})

(defn contains_kwd? 
[syn_set str]
    (def lowerStr (string/lower-case str))
    (def amount 0)
    (doseq [key syn_set] 
        (if (string/includes? lowerStr key) 
            (def amount (+ amount 1)) nil))
    (if (> amount 0) true false)
)

(defn which_park? 
[syn_set str]
    (def lowerStr (string/replace (string/lower-case str) " " ""))
    (def city "")
    (doseq [key syn_set] 
        (def lowerKey (string/replace (string/lower-case key) "_" ""))
        (cond (or (string/includes? lowerStr lowerKey)  (string/includes? lowerKey lowerStr))
            (def city key)))
city)

; (defn identify_park
; [park_string]
;     (cond
;         (contains_kwd? alt_bertramka park_string) (def identified_park "bertramka")
;         (contains_kwd? alt_frantiskanska_zahrada park_string) (def identified_park "frantiskanska_zahrada")
;         (contains_kwd? alt_obora_hvezda park_string) (def identified_park "obora_hvezda")
;         (contains_kwd? alt_kampa park_string) (def identified_park "kampa")
;         (contains_kwd? alt_kinskeho_zahrada park_string) (def identified_park "kinskeho_zahrada")
;         (contains_kwd? alt_klamovka park_string) (def identified_park "klamovka")
;         (contains_kwd? alt_ladronka park_string) (def identified_park "ladronka")
;         (contains_kwd? alt_letna park_string) (def identified_park "letna")
;         (contains_kwd? alt_petrin park_string) (def identified_park "petrin")
;         (contains_kwd? alt_riegrovy_sady park_string) (def identified_park "riegrovy_sady")
;         (contains_kwd? alt_stromovka park_string) (def identified_park "stromovka")
;         (contains_kwd? alt_vysehrad park_string) (def identified_park "vysehrad")
;         :else (println "Not in park sets"))
;         (println "identified park is: " identified_park)
;         (def identified_park_obj ((resolve (symbol identified_park))))
;         )

(defn assign_keyword_category 
[keyword]
  (cond
    (contains_kwd? alt_food keyword) (def category :food)
    (contains_kwd? alt_toilet keyword) (def category :toilet)
    (contains_kwd? alt_POI keyword) (def category :POI)
    (contains_kwd? alt_bike keyword) (def category :bike_path)
    (contains_kwd? alt_skating keyword) (def category :skating)
    (contains_kwd? alt_sports keyword) (def category :sports_field)
    (contains_kwd? alt_playground keyword) (def category :playground)
    (contains_kwd? alt_public_transport keyword) (def category :public_transport)
    (contains_kwd? alt_coords keyword) (def category :GPS_coords)
    (contains_kwd? alt_parking keyword) (def category :parking)
    (contains_kwd? alt_dogs keyword) (def category :dogs)
    (contains_kwd? alt_path keyword) (def category :path_type)
    (contains_kwd? alt_administration keyword) (def category :administered_by)
    (contains_kwd? alt_hours keyword) (def category :opening_hours)
    (contains_kwd? alt_map keyword) (def category :map_url)
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
  (println "Hi, I am a park guide chatbot specialized in Prague parks. Who are you?") ;1st welcome message
  (def username (read-line))
  (println (str "Nice to meet you, " username "! Which park would you like to know more about?"))
  (def user_park_string (read-line))
 ;getting the park
  (def identified_park (which_park? parks user_park_string)) ;defines variable identified_park
  ;(def chosen_park (read-line))
  ;(println "You have chosen the park: " chosen_park)
  (println "You have chosen the park: " identified_park)
  (println "Feel free to ask me questions about "  identified_park ". If you want to ask about a different park, restart the bot.")
  (def identified_park (resolve (symbol identified_park)))
  (loop [input (read-line)] ;takes user input, stores it in variable
    (if (= input "stop") ;checks user input, if "stop, ends loop"
      (do
         (println "Thank you and see you next time!")) ;prints message if user input is "stop", no more recursion, ends the loop
      (do
        (println "You typed: " input)
        (assign_keyword_category input)
        ;(check_cat_bool identified_park category)
        ; (cond ;park-specific cat check
        ;    (= identified_park "bertramka") (check_cat_bool bertramka category)
        ;    (= identified_park "frantiskanska_zahrada") (check_cat_bool frantiskanska_zahrada category)
        ;    (= identified_park "obora_hvezda") (check_cat_bool obora_hvezda category)
        ;    (= identified_park "kampa") (check_cat_bool kampa category)
        ;    (= identified_park "kinskeho_zahrada") (check_cat_bool kinskeho_zahrada category)
        ;    (= identified_park "klamovka") (check_cat_bool klamovka category)
        ;    (= identified_park "ladronka") (check_cat_bool ladronka category)
        ;    (= identified_park "letna") (check_cat_bool letna category)
        ;    (= identified_park "petrin") (check_cat_bool petrin category)
        ;    (= identified_park "riegrovy_sady") (check_cat_bool riegrovy_sady category)
        ;    (= identified_park "stromovka") (check_cat_bool stromovka category)
        ;    (= identified_park "vysehrad") (check_cat_bool vysehrad category)
        ;    )
           (check_cat_bool identified_park category)
           

        (cond ;prints user friendly phrase
           (and (= category :food) (= checked_bool false)) (get_response phrases_false :food)
           (and (= category :food) (= checked_bool true)) (get_response phrases_true :food)
           (and (= category :toilet) (= checked_bool false)) (get_response phrases_false :toilet)
           (and (= category :toilet) (= checked_bool true)) (get_response phrases_true :toilet)
           (and (= category :POI) (nil? (identified_park :POI))) (get_response phrases_false :POI)
           (and (= category :POI) (not (nil? (identified_park :POI)))) (get_response phrases_true :POI)
           (and (= category :bike_path) (= checked_bool false)) (get_response phrases_false :bike_path)
           (and (= category :bike_path) (= checked_bool true)) (get_response phrases_true :bike_path)
           (and (= category :skating) (= checked_bool false)) (get_response phrases_false :skating)
           (and (= category :skating) (= checked_bool true)) (get_response phrases_true :skating)
           (and (= category :sports_field) (= checked_bool false)) (get_response phrases_false :sports_field)
           (and (= category :sports_field) (= checked_bool true)) (get_response phrases_true :sports_field)
           (and (= category :playground) (= checked_bool false)) (get_response phrases_false :playground)
           (and (= category :playground) (= checked_bool true)) (get_response phrases_true :playground)
           (and (= category :public_transport) (nil? (identified_park :public_transport))) (get_response phrases_false :public_transport)
           (and (= category :public_transport) (not (nil? (identified_park :public_transport)))) (get_response phrases_true :public_transport)
           (and (= category :parking) (= checked_bool false)) (get_response phrases_false :parking)
           (and (= category :parking) (= checked_bool true)) (get_response phrases_true :parking)
           (and (= category :dogs) (= checked_bool false)) (get_response phrases_false :dogs)
           (and (= category :dogs) (= checked_bool true)) (get_response phrases_true :dogs))

        (cond ;prints extra information
           (and (= category :food) (= checked_bool true) (not (nil? (identified_park :food_extra)))) (println (identified_park :food_extra))
           (and (= category :toilet) (= checked_bool true) (not (nil? (identified_park :toilet_extra)))) (println (identified_park :toilet_extra))
           (and (= category :sports_field) (= checked_bool true) (not (nil? (identified_park :sports_field_extra)))) (println (identified_park :sports_field_extra))
           (and (= category :playground) (= checked_bool true) (not (nil? (identified_park :playground_extra)))) (println (identified_park :playground_extra))
           (and (= category :parking) (= checked_bool true) (not (nil? (identified_park :parking_extra)))) (println (identified_park :parking_extra))
           (and (= category :POI) (not (nil? (identified_park :POI)))) (println (identified_park :POI))
           (and (= category :public_transport) (not (nil? (identified_park :public_transport)))) (println "You can reach this park by the following public transport options: " (identified_park :public_transport))
           (and (= category :GPS_coords) (not (nil? (identified_park :GPS_coords)))) (println "The GPS co-ordinates are: " (identified_park :GPS_coords))
           (and (= category :path_type) (not (nil? (identified_park :path_type)))) (println "Path types at this park: " (identified_park :path_type))
           (and (= category :administered_by) (not (nil? (identified_park :administered_by)))) (println "The park is administered by: "(identified_park :administered_by))
           (and (= category :opening_hours) (not (nil? (identified_park :opening_hours)))) (println "The opening hours are: " (identified_park :opening_hours))
           (and (= category :map_url) (not (nil? (identified_park :map_url)))) (println "You can find the park map here: "(identified_park :map_url))
           )
        (recur (read-line)) ;repeats loop aka recursion, takes new input, repeats process
      )
    )
  )) 
(prototype)

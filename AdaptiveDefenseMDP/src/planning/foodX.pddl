;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; FoodX Restaurant
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(define (domain FOODX)
  (:requirements :strips :typing :disjunctive-preconditions :equality)
  (:types location status)
  (:constants kitchen dining_room table1 table2 hallway office - location
  	empty occupied requested received in_preparation ready collected delivered paid - status)
  (:predicates (location ?x - location)
	       (table1 ?x - status)
	       (table2 ?x - status)
	       )

(:action move_to_kitchen
		 :parameters	()
	     :precondition (location hallway) 
	     :effect
	     (location kitchen)
)

(:action move_to_hallway
	     :parameters ()
	     :precondition (or (location hallway) (location kitchen) (location office)) 
	     :effect
	     (location hallway)
)

(:action move_to_dining_room
	     :parameters ()
	     :precondition (or (location hallway) (location table1) (location table2)) 
	     :effect
	     (location dining_room)
)	     
	     

(:action move_to_office
	     :parameters ()
	     :precondition (location hallway)
	     :effect
	     (location office)
)	     
	     
(:action move_to_table1
	     :parameters ()
	     :precondition (location dining_room)
	     :effect
	     (location table1)
)	     

(:action move_to_table2
	     :parameters ()
	     :precondition (location dining_room)
	     :effect
	     (location table2)
)	

(:action ask_order1
	     :parameters ()
	     :precondition (and (location table1)(table1 occupied))
	     :effect
	     (table1 requested)
)	

(:action pass_order1
	     :parameters ()
	     :precondition (and (location kitchen)(table1 received))
	     :effect
	     (table1 in_preparation)
)	

(:action collect_order1
	     :parameters ()
	     :precondition (and (location kitchen)(table1 ready))
	     :effect
	     (table1 collected)
)		

(:action deliver_order1
	     :parameters ()
	     :precondition (and (location table1) (table1 collected))
	     :effect
	     (table1 delivered)
)	

(:action clean_table1
	     :parameters ()
	     :precondition (and (location table1) (table1 paid))
	     :effect
	     (table1 empty)
)	

(:action ask_order2
	     :parameters ()
	     :precondition (and (location table2)(table2 occupied))
	     :effect
	     (table2 requested)
)	

(:action pass_order2
	     :parameters ()
	     :precondition (and (location kitchen)(table2 received))
	     :effect
	     (table2 in_preparation)
)	

(:action collect_order2
	     :parameters ()
	     :precondition (and (location kitchen)(table2 ready))
	     :effect
	     (table2 collected)
)		

(:action deliver_order2
	     :parameters ()
	     :precondition (and (location table2) (table2 collected))
	     :effect
	     (table2 delivered)
)	

(:action clean_table2
	     :parameters ()
	     :precondition (and (location table2) (table2 paid))
	     :effect
	     (table2 empty)
)	
)


  
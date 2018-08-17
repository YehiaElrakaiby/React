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
	     (and
	     (location kitchen)
	     (not (location hallway))
	     )
)

(:action move_to_hallway
	     :parameters ()
	     :precondition (or (location dining_room) (location kitchen) (location office)) 
	     :effect
	     (and
	     (location hallway)
	     (not (location dining_room))
	     (not (location kitchen))
	     (not (location office))
	     )
)

(:action move_to_dining_room
	     :parameters ()
	     :precondition (or (location hallway) (location table1) (location table2)) 
	     :effect
	     (and
	     (location dining_room)
	     (not (location hallway))
	     (not (location table1))
	     (not (location table2))
	     )
)	     
	     

(:action move_to_office
	     :parameters ()
	     :precondition (location hallway)
	     :effect
	     (and
	     (location office)
	     (not (location hallway))
	     )
)	     
	     
(:action move_to_table1
	     :parameters ()
	     :precondition (location dining_room)
	     :effect
	     (and
	     (location table1)
	     (not (location dining_room))
	     )
)

(:action get_order1
	     :parameters ()
	     :precondition (and (location table1)(table1 occupied))
	     :effect
	     (and 
	     (table1 requested)
	     (not (table1 occupied))
	     )
	     
)	

(:action pass_order1
	     :parameters ()
	     :precondition (and (location kitchen)(table1 received))
	     :effect
	     (and
	     (table1 in_preparation)
	     (not (table1 received))
	     )
)
	

(:action collect_order1
	     :parameters ()
	     :precondition (and (location kitchen)(table1 ready))
	     :effect
	     (and
	     (table1 collected)
	     (not (table1 ready))
	     )
)		

(:action deliver_order1
	     :parameters ()
	     :precondition (and (location table1) (table1 collected))
	     :effect
	     (and
	     (table1 delivered)
	     (not (table1 collected))
	     )
)	

(:action clean_table1
	     :parameters ()
	     :precondition (and (location table1) (table1 paid))
	     :effect
	     (and
	     (table1 empty)
	     (not (table1 paid))
	     )
)	

(:action move_to_table2
	     :parameters ()
	     :precondition (location dining_room)
	     :effect
	     (and 
	     	(location table2)
	     	(not (location dining_room))
	     )
	     
)	

(:action get_order2
	     :parameters ()
	     :precondition (and (location table2)(table2 occupied))
	     :effect
	     (and 
	     (table2 requested)
	     (not (table2 occupied))
	     )
	     
)	

(:action pass_order2
	     :parameters ()
	     :precondition (and (location kitchen)(table2 received))
	     :effect
	     (and
	     (table2 in_preparation)
	     (not (table2 received))
	     )
)
	

(:action collect_order2
	     :parameters ()
	     :precondition (and (location kitchen)(table2 ready))
	     :effect
	     (and
	     (table2 collected)
	     (not (table2 ready))
	     )
)		

(:action deliver_order2
	     :parameters ()
	     :precondition (and (location table2) (table2 collected))
	     :effect
	     (and
	     (table2 delivered)
	     (not (table2 collected))
	     )
)	

(:action clean_table2
	     :parameters ()
	     :precondition (and (location table2) (table2 paid))
	     :effect
	     (and
	     (table2 empty)
	     (not (table2 paid))
	     )
)

	
)


  
package game;

import fixtures.room;


public class roomManager {
	/*
	 * The RoomManager class will create the entire house 
	 * and can be used to manage the rooms individually or
	 * provide functionality to navigate through the house
	 * in its entirety...
	 */
		// Used to determine the first room the player is placed
		private room startingRoom;

		// Collection of all rooms in the house
		private room[] chemLab;
		
		/*
		 * Parameterized Constructor. roomCount is used to dictate
		 * the number of rooms of the house we create.
		 */
		public roomManager(int roomCount) {
			super();
			chemLab = new room[roomCount];
		}
		
		/*
		 * The init method does ALOT and is called at the 
		 * start of the program...it will:
		 *  -create the various Room Objects
		 *  -establish connected exits to rooms
		 *  -create objects to place within the rooms
		 *  -add all rooms to the collection of rooms for the house
		 */
		public void init() {
			// EX: Creating a Room:
			room entrance = new room(
				"Entrance",
				"Entrance - This is your starting point",
				"Entrance  - Welcome... This is the entrance into the Chemistry Lab. "
				+ "This has a receptionist asking for your ID to issue you a badge and security is asking for your bag.\n"
				+ " \nYou are allowed to move or go: west or east");
			
			this.chemLab[0] = entrance;
			this.startingRoom = entrance;
			//items.interact(badge);
			
				room lab1 = new room(
					"Lab 1",
					"Lab 1 - This is the lab testing vials for medical use.",
					"Lab 1 - They are currently testing vials for the COVID-19 Vaccine."
					+ " \n There are multiple stations full with biochemist and researchers working in teams. You can go East or North");
				this.chemLab[1] = lab1;
				
				room lab2 = new room(
						"Lab 2 ",
						"Lab 2 - They are currently testing new skincare products  ",
						"Lab 2 - Here they are testing formulas for skincare products. They are making sure it is safe for human use. "
						+ "There are skin experts and lab techs working in teams to create the best formula  You can go West or North");
					this.chemLab[2] = lab2;
					
				room lab3 = new room(
						"Lab 3 ",
						"Lab 3 - This is the biggest testing lab in the entire facility",
						"Lab 3 - This is where we hold our most dangerous chemicals. "
						+ "Everyone entering this room has to wear a hazmat suit. Make sure to be incredibly careful. "
						+ "Do not touch vials or beakers in this room."
						+ " This is the last room in our game. There are no exits "
						+ "if you would like to leave just type quit. ");
					this.chemLab[3] = lab3;
						
				//sets  the exits for the rooms created
					
				
				room[] entranceExits = new room[] {null,null,lab1,lab2};
				entrance.setExits(entranceExits);
				
				
				room[] lab1Exits = new room [] {lab3,null,null,entrance};
				lab1.setExits(lab1Exits);
				
				room[] lab2Exits = new room[] {lab3,null,entrance,null};
				lab2.setExits(lab2Exits);
				
				
				room[] lab3Exits = new room [] {null,null,null,null};
				lab1.setExits(lab3Exits);
				
			
				
				//if (entranceExits return null) {}
				}
		
					
		
		/*
		 * Method used to retrieve a single room based on it's
		 * index...
		 * 
		 */
		public room getRoom(int index) {
			return chemLab[index];
		
		
			
		}
		
		/*
		 * Method used to retrieve a single room based on it's
		 * name...
		 */
		public room getRoom(String roomName) {
			
			
	for (int i = 0;  i < chemLab.length; i++) {
		String b = chemLab[i].getName().intern();
			if (b == roomName) {
				System.out.println(chemLab[i].getName());
				return chemLab[i];
			}
			
			
			
			}
	
	return null;
	
		}
		
		// getters and setters
		public room getStartingRoom() {
			return this.startingRoom;
		}
		
		public void setStartingRoom(room startingRoom) {
			this.startingRoom = startingRoom;
		}
		
		public room[] getchemLab() {
			return this.chemLab;
		}
		
		public void setchemLab(room[] chemLab) {
			this.chemLab = chemLab;
		}
	}


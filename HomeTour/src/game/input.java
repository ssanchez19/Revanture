package game;

import java.util.Scanner;

import fixtures.Fixture;
import fixtures.Interactable;
import fixtures.room;

public class input {
	/*
	 * This method prints information to the console regarding the 
	 * player's current location...
	 * This method, along with the instructions for how to play may
	 * be better suited for another separate "Menus or Display" class
	 * 
	 * You can also print information about connecting rooms here...
	 */
	
	public static void printRoom(player player) {
		System.out.println("|||||||||||| CURRENT ROOM ||||||||||||");
		System.out.println("Name:" + player.getCurrentRoom().getName());
		System.out.println("Short Description:" + player.getCurrentRoom().getshortDesc());
		System.out.println("Long Description:" + player.getCurrentRoom().getlongDesc());
		
	}
	
	/*
	 * The collectInput Method used to gather input from 
	 * the user, and convert it to an array... This array
	 * is then used with the parse method below to
	 * perform actions based on the information received
	 * 
	 * Note: The 'split()' method of String objects can 
	 * be used to provide an array of Strings from a 
	 * single string.
	 * 
	 * String sentence = "Hello my name is Joseph";
	 * String[] words = sentence.split(" ");
	 * The array 'words' will look like the following:
	 * ["Hello","my","name","is","Joseph"]
	 */
	public static String[] collectInput() {
	  Scanner scan = new Scanner(System.in);
	  String Input = scan.nextLine();
	 //scan.close();
	  
	  String[] phrase = Input.split(" ");
	  return phrase;
	  

	}
	/*
	 * Method used to examine collected input and perform actions
	 * 
	 * This method specifically looks through the array of
	 * String objects and determines what other functionality to
	 * perform (move the player object's 'currentRoom', invoke
	 * the 'interact' method of an object, etc...) based on
	 * comparisons for the Strings in the String array
	 */
	
	public static void parse(String[] command, player player) {
		String action = command[0].toUpperCase().intern();
		String option = null;
		//System.out.println(action);
		if (command.length > 1) {
			option =command[1].toUpperCase().intern();
		}
		if (action == "GO" | action =="MOVE") {
			System.out.println("You decided to move: " + option);
			
			room move = player.getCurrentRoom().getExit(option);
			player.setCurrentRoom(move);
			  
			 
			 
			//if (option != null) {}
			
			//System.out.print(move);
			
			//player.setExits(move);
		}
		else if (action.equalsIgnoreCase("INTERACT")) {
			for (Fixture i : player.getCurrentRoom().getItems()) {
				if (i.getName().equalsIgnoreCase(option) & (i instanceof Interactable)) {
					((Interactable) i).interact();
				}
			}
		}
				else if (action =="QUIT") {
					runner.endGame();
				}
				else
				{
					System.out.println ("Please try again. Enter a valid command.");
				}
				
				
			
		
	}
	//scan.close(); 
}


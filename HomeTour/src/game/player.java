
package game;

import fixtures.room;

/*
 * The player class represents the user's current
 * position within a house.
 */
public class player {
	private room currentRoom;
	
	
	public room getCurrentRoom() {
		return currentRoom;
	}
	
	public void setCurrentRoom(room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	
}
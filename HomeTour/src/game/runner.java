package game;

public class runner {
	/*
	 * We only need one room manager, so we will make it static
	 * The '4' passed to the RoomManager constructor is used
	 * to arbitrarily establish the starting size for the house
	 */
	private static roomManager manager = new roomManager(4);
	
	// Boolean used to control when our game is running. We set it to true initially
	private static boolean running = true;
		
	// Main application method
	public static void main(String[] args) {
		// Run the init method to instantiate our house
		manager.init();		
		
		/* Create the player here. 
		 * Note: We could have made the player a static reference 
		 * much like our RoomManager...
		 */
		player player = new player();
		
		System.out.println("Welcome to My Chemisty Lab"
				+ "This is how to play the game. "
				+ "\n To move around the lab: Use GO or MOVE"
				+ "\n You can move or go south,north,west,east "
				+ "\nto You can also interact with objects by typing INTERACT"
				+ "\ntBe Careful with what you choose to mix. We work with dangerous chemicals!!");
		
		
		// The player should start in the 'starting room'
		player.setCurrentRoom(manager.getStartingRoom());
		
		/*
		 * The logic for our Game loop can be VERY simple...
		 * All we need to do is:
		 *   -Print the player's current room
		 *   -Ask for more input
		 *   -Parse that input
		 *   
		 * We could also print a list of commands as a reference...
		 */
		while (running) {
			input.printRoom(player);
			System.out.println("Where would you like to go?\n");
			String[] Input = input.collectInput();
			input.parse(Input,player);
			//currentRoom = game.player.getCurrentRoom();
			
		}
		
		
		
		/*
		 * Technically, this if statement is redundant...we will only reach
		 * this line, if 'running' ceases to be true...
		 */
		if (!running) {
			System.out.println("Thanks for playing");
		}
	}
	
	/*
	 * Since 'running' is a private field, we need a method to be
	 * able to change it's value. This can be called from other classes
	 * (such as Input) to end our game based on input received
	 */
	public static void endGame() {
		running = false;
	}
}
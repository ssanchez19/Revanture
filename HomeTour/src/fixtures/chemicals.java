package fixtures;

public class chemicals  extends Fixture implements Interactable {

		public chemicals (String name,String shortDesc,String longDesc) {
			super(name,shortDesc,longDesc);
		}

		public void interact() {
			System.out.println("you've touched dangerous chemicals"
					+ "10....9....8....7.....6.....5......4......3.....2.....1.....0"
					+ " BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOMMMMMMMMMMMMMM");
		}
	}



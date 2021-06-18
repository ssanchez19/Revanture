package fixtures;

public class room extends Fixture {
	
	private room[] exits = new room[3];
	
	private Fixture [] items;
	
	public room(String name,String shortDesc, String longDesc ) {
		super (name,shortDesc,longDesc);
	}
	

	
 public room [] getExits() {
	 return this.exits;
 }
 
 public room getExit(String direction) {
	int index = 0;
	direction = direction.toUpperCase();
	
	switch (direction) {
	
	case "NORTH":
	
		index = 0;
		break;
		
	case "SOUTH":
		index = 1;
		break;
		
	case "WEST":
		index = 2;
		break;
	case "EAST":
		index = 3;
		break;
		
	}
	return exits[index];
 }
 
 
 public void setExits(room[] exits) {
	 this.exits = exits;
	 
 }
 
public void setExits(room exit, int index) {
	this.exits[index] = exit;
}

public Fixture[] getItems() {
	return items;
}

public void setItems(Fixture ...items) {
	this.items = items;
}

}

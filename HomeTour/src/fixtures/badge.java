package fixtures;

public class badge extends Fixture implements Interactable {
	public badge (String name,String shortDesc,String longDesc) {
		super(name,shortDesc,longDesc);
	}

	public void interact() {
		System.out.println("*Receptionist checks your id and hands you a badge."
				+ "Receptionist: You are a guest"
				+ " here so please be sure to watch and not touch"
				+ " unless instructed to do so. Security: Your bag has been cleared."
				+ " Please pick up you belongings and continue through the facility");
	}
}

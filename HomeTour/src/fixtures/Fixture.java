package fixtures;

public abstract class Fixture {
	 
		protected String name;
		
		protected String shortDesc;
		
		protected String longDesc;
		
	
		

		
		public Fixture (String name, String shortDesc, String longDesc) {
			super();
			this.name = name;
			this.shortDesc = shortDesc;
			this.longDesc = longDesc;
			
			
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getshortDesc() {
			return shortDesc;
		}
		
		public void setshortDesc(String shortDesc) {
			this.shortDesc = shortDesc;
		
	}
		public String getlongDesc() {
			return longDesc;
		}
		
		public void setlongDesc(String longDesc) {
			this.longDesc = longDesc;
		}
		
		public String toString() {
			return "Fixture[name=" + name + ",shortDesc =" + shortDesc + ",longDesc =" + longDesc + "]";
		}
	
}
	


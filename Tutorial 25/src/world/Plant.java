package world;

public class Plant {
	//Bad practice
	public String name;
	
	//Acceptable practice --- it's final.
	public final static int ID = 2;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Audrey II";
		this.type = "Alien Plant";
		this.size = "medium";
	}
	
}

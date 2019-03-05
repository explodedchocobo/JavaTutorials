package world;

public class Field {
	private Plant plant = new Plant();
	
	public Field() {
		
		//Size is protected, Field is in the same package as Plant
		System.out.println(plant.size);
		
	}
	
}

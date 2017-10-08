package model;

public abstract class Vehicle {
	
	private String plateNum;
	
	public Vehicle(String plate) {
		this.plateNum = plate;
	}
	
	public String getPlate() {
		return plateNum;
	}

	@Override
	public String toString() {
		return "Type " + this.getClass() + " License Plate # " + plateNum + "\n";
	}
	
	
	
	

}

package Exercise1;

public class Car {

	private String brand;
	private String model;
	
	public Car() {
		
	}
	
	public Car(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	public void displayCar() {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
	}
	
	public String setBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String setModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
}

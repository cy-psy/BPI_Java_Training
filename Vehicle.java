package Exercise2;

public abstract class Vehicle {

	int numberOfWheels;
	String brand;
	
	public Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.brand = brand;
	}

	public abstract void startEngine();
	
	public void destroy() {
		System.out.println(brand + " vehicle destroyed!");
	}
}

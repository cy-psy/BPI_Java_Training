package Exercise2;

public class Truck extends Vehicle implements Refuelable {

	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}

	@Override
	public void startEngine() {
		System.out.println("Truck: " + brand + "\nNumber of Wheels: " + numberOfWheels);
		System.out.println("Truck engine started...");
	}
	
	@Override
	public void refuel() {
		System.out.println("Truck is refueling...\n");
	}
}

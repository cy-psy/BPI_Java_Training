package Exercise2;

public class Car extends Vehicle implements Refuelable {

	public Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}

	@Override
	public void startEngine() {
		System.out.println("Car: " + brand + "\nNumber of Wheels: " + numberOfWheels);
		System.out.println("Car engine started...");
	}
	
	@Override
	public void refuel() {
		System.out.println("Car is refueling...\n");
	}
}

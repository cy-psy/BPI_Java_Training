package Exercise2;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car(4, "Honda");
		Truck truck = new Truck(10, "Foton");
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
		destroyVehicle(truck);
	}
	
	public static void destroyVehicle(Vehicle vehicle) {
		vehicle.destroy();
	}

}

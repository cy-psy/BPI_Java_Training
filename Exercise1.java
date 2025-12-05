package Exercise1;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.setBrand("Toyota");
		car1.setModel("Vios");
		
		Car car2 = new Car("Mitsubishi", "Xpander");
		
		System.out.println("Car 1 Details");
		car1.displayCar();
		System.out.println("");
		System.out.println("Car 2 Details");
		car2.displayCar();
		
	}

}

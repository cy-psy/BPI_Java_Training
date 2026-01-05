package GroupActivity;

import java.util.Queue;
import java.util.Scanner;

public class Option1 {

	public static void addProduct(Queue<Product> queue, Scanner sc) {
		System.out.print("Enter product name: ");
		String name = sc.nextLine();

		System.out.print("Enter product price: ");
		double price = sc.nextDouble();

		if (price <= 0) {
			System.out.println("Invalid price.");
		} else {
			queue.add(new Product(name, price));
			System.out.println("Product added to queue.");
		}
	}
}

package GroupActivity;

import java.util.Queue;
import java.util.Scanner;

public class Option2 {

	public static double processProduct(Queue<Product> queue, Scanner sc, double totalBill) {
		if (queue.isEmpty()) {
			System.out.println("No products to process.");
		} else {
			Product p = queue.poll();
			totalBill += p.price;
			System.out.println("Processed product: " + p.name + " - " + p.price);
			System.out.println("Updated total bill: " + totalBill);
		}
		return totalBill;
	}
}

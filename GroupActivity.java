package GroupActivity;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GroupActivity {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Queue<Product> queue = new LinkedList<>();
		double totalBill = 0.0;
		int choice;

		queue.add(new Product("Ham", 170));
		queue.add(new Product("Spaghetti Sauce", 48.50));
		queue.add(new Product("Pasta", 70.95));
		queue.add(new Product("Fruit Cocktail", 61.75));
		queue.add(new Product("All Purpose Cream", 36.50));

		do {
			System.out.println("\nSelect an option:");
			System.out.println("1. Add a product");
			System.out.println("2. Process next product");
			System.out.println("3. Check number of products");
			System.out.println("4. View total bill");
			System.out.println("5. Exit");
			System.out.print("> ");

			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				Option1.addProduct(queue, sc);
				break;
			case 2:
				totalBill = Option2.processProduct(queue, sc, totalBill);
				break;
			case 3:
				Option3.countProduct(queue, sc);
				break;
			case 4:
				Option4.totalBill(queue, sc, totalBill);
				break;
			case 5:
				Option5.totalBill(queue, sc, totalBill);
				break;
			default:
				System.out.println("Invalid option. Try again.");
			}

		} while (choice != 5);

		sc.close();
	}
}

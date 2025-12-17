package GroupProject;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GroupProject {
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
					System.out.print("Enter product name: ");
					String name = sc.nextLine();

					System.out.print("Enter product price: ");
					double price = sc.nextDouble();
					
					if (price <= 0) {
						System.out.println("Invalid price.");
						break;
					}

					queue.add(new Product(name, price));
					System.out.println("Product added to queue.");
					break;

				case 2:
					if (queue.isEmpty()) {
						System.out.println("No products to process.");
					} else {
						Product p = queue.poll();
						totalBill += p.price;
						System.out.println("Processed product: " + p.name + " - " + p.price);
						System.out.println("Updated total bill: " + totalBill);
					}
					break;

				case 3:
					System.out.println("Products waiting in queue: " + queue.size());
					break;

				case 4:
					System.out.println("Total bill so far: " + totalBill);
					break;

				case 5:
					System.out.println("Final total bill: " + totalBill);
					System.out.println("Exiting...");
					break;

				default:
					System.out.println("Invalid option. Try again.");
			}

		} while (choice != 5);

		sc.close();
	}
}

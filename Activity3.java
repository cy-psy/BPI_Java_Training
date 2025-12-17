package Activity3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> products = new HashMap<>();
        products.put("Laptop", 50000);
        products.put("Monitor", 7000);
        products.put("Mouse", 500);
        products.put("Keyboard", 1000);
        products.put("Printer", 6000);

        int choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Search a product");
            System.out.println("2. Add a product");
            System.out.println("3. Print all products and prices");
            System.out.println("4. Find the cheapest product");
            System.out.println("5. Exit");
            System.out.print("> ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name to search: ");
                    String search = sc.nextLine();

                    if (products.containsKey(search)) {
                        System.out.println("Product found! Price: " + products.get(search));
                    } else {
                        System.out.println("Product not found!");
                    }
                    break;

                case 2:
                    System.out.print("Enter product name to add: ");
                    String name = sc.nextLine();

                    System.out.print("Enter price: ");
                    int price = sc.nextInt();

                    products.put(name, price);
                    System.out.println("Product added: " + name);
                    break;

                case 3:
                    System.out.println("\nAll products and prices:");
                    for (Map.Entry<String, Integer> entry : products.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    System.out.println("Total products: " + products.size());
                    break;

                case 4:
                    String cheapestProduct = null;
                    int cheapestPrice = Integer.MAX_VALUE;

                    for (Map.Entry<String, Integer> entry : products.entrySet()) {
                        if (entry.getValue() < cheapestPrice) {
                            cheapestPrice = entry.getValue();
                            cheapestProduct = entry.getKey();
                        }
                    }

                    if (cheapestProduct != null) {
                        System.out.println("Cheapest product: " + cheapestProduct + " - " + cheapestPrice);
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }

        } while (choice != 5);
        sc.close();
    }
}
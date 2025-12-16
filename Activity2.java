package Activity2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Activity2 {

	public static void main(String[] args) {
		Set<String> productList = new HashSet<>();

		productList.add("Laptop");
		productList.add("Mouse");
		productList.add("Keyboard");
		productList.add("Monitor");
		productList.add("Printer");

		Scanner sc = new Scanner(System.in);
		int option;

		do {
			System.out.println("\n========= OPTIONS =========");
			System.out.println("1. Search a product");
			System.out.println("2. Add a product");
			System.out.println("3. Print all products and count");
			System.out.println("4. Exit");
			System.out.print("Select Option: ");
			
			option = sc.nextInt();
			sc.nextLine(); 

			switch (option) {
				case 1:
					System.out.print("\nEnter product name to search: ");
					String findProduct = sc.nextLine();
					if (productList.contains(findProduct)) {
						System.out.println("Product found: " + findProduct);
					} else {
						System.out.println("Product not found!");
					}
					break;
				case 2:
                	System.out.print("\nEnter product name to add: ");
                	String addProduct = sc.nextLine();
                	if (productList.add(addProduct)) {
                		System.out.println("Product added: " + addProduct);
                	} else {
                		System.out.println("Product already exists.");
                	}
                	break;
				case 3:
                    System.out.println("\nAll products:");
                    for (String product : productList) {
                    	System.out.println(product);
                    }
                    System.out.println("Total unique products: " + productList.size());
                    break;
				case 4:
					System.out.println("\nExiting...");
					break;
				default:
					System.out.println("\nInvalid Option!");
            }
        } 
        while (option != 4);
        sc.close();
        
    }
}
package Activity1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		List<String> products = new ArrayList<>(Arrays.asList("Laptop", "Mouse", "Keyboard", "Monitor", "Printer"));
		
		System.out.println("All products:");
		for(int c=0; c<products.size(); c++) {
			System.out.println(c+1 + ". " + products.get(c));
		}
		
		products.add("Webcam");
		products.remove(1);
		
		System.out.println("\nAfter adding and removing products:");
		for(int c=0; c<products.size(); c++) {
			System.out.println(c+1 + ". " + products.get(c));
		}
		
		System.out.println("\nEnter product name to search: ");
		String find = input.nextLine();
		
		if (products.contains(find)) {
			System.out.println("\nProduct found: " + find);
		} else {
			System.out.println("\nProduct not found.");
		}
	}

}

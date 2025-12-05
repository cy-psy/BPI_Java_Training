package Activity4;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		String agest = input.nextLine();
		int agein = Integer.parseInt(agest);
		
		if (agein < 18) {
			System.out.println("Minor");
		} else if (agein < 60) {
			System.out.println("Adult");
		} else {
			System.out.println("Senior");
		}
				
		input.close();
	}

}

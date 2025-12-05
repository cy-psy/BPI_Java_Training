package Activity2;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		String agest = input.nextLine();
		int agein = Integer.parseInt(agest);
		double agedb = agein;

		System.out.println("Your age as int: " + agein);
		System.out.println("Your age as double: " + agedb);
		
		input.close();
	}

}

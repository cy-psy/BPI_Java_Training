package Activity1;

import java.util.Scanner;

public class BankAccount {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Bank Account Name Display ===");
		
		testCase("ACC-001");
		testCase("ACC-999");
		
		System.out.println();
		System.out.println("=== Program completed successfully! ===");
	}
	
	public static String getAccountName(String accountNumber) {
		if (accountNumber == "ACC-001") {
			return "Juan Dela Cruz";
		} else if (accountNumber == "ACC-002") {
			return "Maria Santos";
		} else {
			return null;
		}
	}

	public static void testCase(String accountNumber) {
		System.out.println();
		System.out.print("Looking up account: " + accountNumber);
		System.out.println();

		try {
			String accountName = getAccountName(accountNumber).toUpperCase();
			System.out.print("Account holder: " + accountName);
		} catch (Exception e) {
			System.out.print("Error: Account not found!");
		}
		
		System.out.println();
	}

}

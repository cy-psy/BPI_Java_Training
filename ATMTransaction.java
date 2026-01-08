package Activity3;

public class ATMTransaction {

	public static void checkBalance(String accountNumber, double balance) {

		try {
			System.out.println("Processing balance inquiry...");

			char accountType = accountNumber.charAt(0);
			Integer.parseInt(accountNumber);

			if (accountType == '1') {
				System.out.println("Account Type: Savings");
			} else if (accountType == '2') {
				System.out.println("Account Type: Checking");
			} else {
				System.out.println("Account Type: Unknown");
			}

			System.out.println("Account Number: " + accountNumber);
			System.out.println("Current Balance: P" + String.valueOf(balance));
			System.out.println("Balance inquiry successful!");

		} catch (NumberFormatException e) {
			System.out.println("Error: Invalid account number format!");
			System.out.println("Account numbers must be numeric.");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Error: Account number is empty or invalid!");
		} finally {
			System.out.println();
			System.out.println("========== RECEIPT ==========");
			System.out.println("Transaction Date: December 3, 2025");
			System.out.println("Transaction Type: Balance Inquiry");
			System.out.println("ATM Location: Main Branch");
			System.out.println("Thank you for banking with us!");
			System.out.println("=============================");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		System.out.println("--- Test Case 1: Valid Savings Account ---");
		checkBalance("100123456", 15000.00);
		System.out.println("--- Test Case 2: Valid Checking Account ---");
		checkBalance("200987654", 25000.00);
		System.out.println("--- Test Case 3: Invalid Account Number Format ---");
		checkBalance("ABC12345", 15000.00);
		System.out.println("--- Test Case 4: Empty Account Number ---");
		checkBalance("", 15000.00);
	}
}

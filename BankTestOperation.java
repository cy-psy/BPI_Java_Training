package Activity6;

@FunctionalInterface
public interface BankTestOperation {
	void execute() throws InvalidAmountException, InsufficientFundsException;
}

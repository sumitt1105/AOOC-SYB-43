
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}


class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void balanceEnquiry() {
        System.out.println(accountHolder + ", your current balance is: ₹" + balance);
    }

    public void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit a negative amount.");
        }
        balance += amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    public void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw a negative amount.");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("₹" + amount + " withdrawn successfully.");
    }
}


public class BankApplication {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 10000);

        
        account.balanceEnquiry();

       
        try {
            account.deposit(2000);
            account.deposit(-100); // Will throw NegativeNumberException
        } catch (NegativeNumberException e) {
            System.out.println("Error during deposit: " + e.getMessage());
        }

      
        try {
            account.withdraw(5000);
            account.withdraw(20000); // Will throw LowBalanceException
            account.withdraw(-50);   // Will throw NegativeNumberException
        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Error during withdrawal: " + e.getMessage());
        }

        
        account.balanceEnquiry();
    }
}

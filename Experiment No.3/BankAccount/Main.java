import java.util.Scanner;

class BankAccount {
    private double balance;

    
    public BankAccount(double balance) {
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    
    public SavingsAccount(double balance) {
        super(balance);
    }

    
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() - amount) >= 100) {
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal denied. The balance cannot fall below 100.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        SavingsAccount myAccount = new SavingsAccount(500);

        
        System.out.println("Initial Balance: " + myAccount.getBalance());

        
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        myAccount.deposit(depositAmount);

        
        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        myAccount.withdraw(withdrawAmount);

        
        System.out.println("Final Balance: " + myAccount.getBalance());

       
        scanner.close();
    }
}

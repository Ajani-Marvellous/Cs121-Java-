package weekNine;

// Superclass: BankAccount
public class bankAccount {
    public String accountHolderName;
    public String accountType;  // Corrected to accountType
    public int balance;

    // Constructor to initialize attributes
    public bankAccount(String accountHolderName, String accountType, int balance) {
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to be overridden
    @Override
    public String toString() {
        return "Account Holder: " + accountHolderName + ", Account Type: " + accountType + ", Balance: $" + balance;
    }
}

// Subclass: RegularAccount
class RegularAccount extends bankAccount {
    private int age;

    public RegularAccount(String accountHolderName, String accountType, int balance, int age) {
        super(accountHolderName, accountType, balance);
        this.age = age;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Age: " + age;
    }
}

// Subclass: PremiumAccount
class PremiumAccount extends bankAccount {
    private int creditLimit;

    public PremiumAccount(String accountHolderName, String accountType, int balance, int creditLimit) {
        super(accountHolderName, accountType, balance);
        this.creditLimit = creditLimit;
    }

    // Override toString method
    @Override
    public String toString() {
        return super.toString() + ", Credit Limit: $" + creditLimit;
    }
}

// Main class for demonstration
class bankAccountManagementSystem {
    public static void main(String[] args) {
        // Create instances of RegularAccount and PremiumAccount
        bankAccount regularAccount = new RegularAccount("Alice", "Savings", 500, 30);
        bankAccount premiumAccount = new PremiumAccount("Bob", "Checking", 2000, 10000);

        // Demonstrate polymorphism
        bankAccount[] accounts = {regularAccount, premiumAccount};

        // Print the account details using the overridden toString methods
        for (bankAccount account : accounts) {
            System.out.println(account.toString());
        }
    }
}

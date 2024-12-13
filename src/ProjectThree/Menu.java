package ProjectThree;

import java.util.Scanner;

public class Menu {
    private Scanner scn;
    private Bank bank;

    public Menu() {
        scn = new Scanner(System.in);
        bank = new Bank();
    }

    public void runMenu() {
        int choice = 0;
        while (choice != 4) {
            displayMainMenu();
            if (scn.hasNextInt()) {
                choice = scn.nextInt();
                scn.nextLine(); // Clear buffer
                if (choice == 1) {
                    accessAccount();
                } else if (choice == 2) {
                    openNewAccount();
                } else if (choice == 3) {
                    closeAllAccounts();
                } else if (choice == 4) {
                    System.out.println("Thank you for using Kamai Banking App. Goodbye!");
                } else {
                    System.out.println("Invalid entry. Please enter a valid number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scn.nextLine(); // Clear invalid input
            }
        }
    }

    private void displayMainMenu() {
        System.out.println("\n******* Menu *******");
        System.out.println("1. Access Account");
        System.out.println("2. Open a New Account");
        System.out.println("3. Close All Accounts");
        System.out.println("4. Exit");
        System.out.print("Please make a selection: ");
    }

    private void accessAccount() {
        System.out.print("Enter your PIN: ");
        String pin = scn.nextLine();

        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("PIN is not valid.");
            return;
        }
        System.out.println("Customer: " + customer.getFirstName() + " " + customer.getLastName());
        System.out.println(customer.getAllAccountInfo());

        System.out.print("Enter the account number you want to access: ");
        int accountNumber = scn.nextInt();
        scn.nextLine();

        Account account = customer.getAccountByNum(accountNumber);
        if (account == null) {
            System.out.println("Invalid account number.");
            return;
        }
        accessAccountMenu(account);
    }

    private void accessAccountMenu(Account account) {
        int choice = 0;
        while (choice != 5) {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();
            scn.nextLine();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double deposit = scn.nextDouble();
                account.deposit(deposit);
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawal = scn.nextDouble();
                account.withdraw(withdrawal);
            } else if (choice == 3) {
                System.out.println("Account Balance: $" + account.getBalance());
            } else if (choice == 4) {
                System.out.println("Returning to Main Menu...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private void openNewAccount() {
        System.out.print("Are you a new customer? (1 for Yes, 2 for No): ");
        int response = scn.nextInt();
        scn.nextLine();

        Customer customer = null;
        if (response == 1) {
            customer = createNewCustomer();
        } else if (response == 2) {
            System.out.print("Enter your PIN: ");
            String pin = scn.nextLine();
            customer = bank.getCustomerByPin(pin);
            if (customer == null) {
                System.out.println("PIN is not valid.");
                return;
            }
        } else {
            System.out.println("Invalid response. Returning to Main Menu.");
            return;
        }

        System.out.print("Enter initial deposit: ");
        double initialDeposit = scn.nextDouble();
        Account account = new Account(initialDeposit);
        customer.addAccount(account);

        System.out.println("New Account Opened: " + account.getAccountNumber());
    }

    private Customer createNewCustomer() {
        System.out.print("Enter first name: ");
        String firstName = scn.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scn.nextLine();
        System.out.print("Enter PIN: ");
        String pin = scn.nextLine();

        Customer customer = new Customer(firstName, lastName, pin);
        bank.addCustomer(customer);
        return customer;
    }

    private void closeAllAccounts() {
        System.out.print("Enter your PIN: ");
        String pin = scn.nextLine();

        if (bank.removeCustomer(pin)) {
            System.out.println("Customer removed from bank registry.");
        } else {
            System.out.println("Invalid PIN. No customer removed.");
        }
    }
}

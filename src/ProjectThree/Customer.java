package ProjectThree;

import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private ArrayList<Account> accounts;

    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public boolean removeAccount(Account account) {
        return accounts.remove(account);
    }

    public Account getAccountByNum(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public String getAllAccountInfo() {
        StringBuilder info = new StringBuilder("Accounts for " + firstName + " " + lastName + ":\n");
        for (Account account : accounts) {
            info.append(account.toString()).append("\n");
        }
        return info.toString();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", PIN: " + pin;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPin() {
        return pin;
    }
}

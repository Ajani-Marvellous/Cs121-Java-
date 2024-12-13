package ProjectThree;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Customer> customers;

    public Bank() {
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public boolean removeCustomer(String pin) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getPin().equals(pin)) {
                customers.remove(i);
                return true;
            }
        }
        return false;
    }

    public Customer getCustomerByPin(String pin) {
        for (Customer customer : customers) {
            if (customer.getPin().equals(pin)) {
                return customer;
            }
        }
        return null;
    }

    public String getAllCustomerInfo() {
        StringBuilder allInfo = new StringBuilder();
        for (Customer customer : customers) {
            allInfo.append(customer.toString()).append("\n");
        }
        return allInfo.toString();
    }
}

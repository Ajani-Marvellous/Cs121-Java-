package weekTen.interfac;

public class customerInterface implements Interactable {
    @Override
    public void interact() {
        System.out.println("Customer is reserving a table and placing an order.");
    }
}

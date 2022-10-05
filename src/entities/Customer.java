package entities;

public class Customer {
    private String customerName;
    private String Order;

    public Customer(String customerName, String order) {
        this.customerName = customerName;
        Order = order;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrder() {
        return Order;
    }
}

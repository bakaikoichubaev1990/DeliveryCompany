package entities;

public class Order {
    private  int orderFee;
    private Lood Lood;

    public Order(entities.Lood lood) {
        this.orderFee = lood.getWeight()*DeliveryCompany.pricePerKilogram;
        Lood = lood;
    }
}

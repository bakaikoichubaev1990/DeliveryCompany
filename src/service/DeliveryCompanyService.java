import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;

public class DeliveryCompanyService {
    private ArrayList<DeliveryCompany> deliveryCompany = new ArrayList<>();


    public void acceptOrder(Order order, String companyName, String customerName) {
        deliveryCompany.stream().filter(x -> x.getCompanyName().equals(companyName)).findFirst().ifPresent(y -> y.getList().stream()
                .filter(a -> a.getCustomerName().equals(customerName)).findFirst().ifPresent(b -> b.setOrder(order)));
    }


    public void createDeliveryCompany(DeliveryCompany deliveryCompany) {
        this.deliveryCompany.add(deliveryCompany);


    }
    public void getTotalFee(String customerName){
        for (int i = 0; i < deliveryCompany.size(); i++) {
            if (deliveryCompany.get(i).getList().get(i).getCustomerName().equals(customerName)){
                System.out.println(deliveryCompany.get(i).getList().get(i).getOrder().getLood().getWeight()*DeliveryCompany.pricePerKilogram);
            }

        }

    }
    public void getCompanyProfit(String companyName){
        int kg = 0;
        int kireshe = 0;
        for (int i = 0; i < this.deliveryCompany.size(); i++) {
            if (this.deliveryCompany.get(i).getCompanyName().equals(companyName)){
                for (int j = 0; j < deliveryCompany.get(i).getList().size(); j++) {
                    kg += deliveryCompany.get(i).getList().get(j).getOrder().getLood().getWeight();
                }
            }

        }
        kireshe = kg*DeliveryCompany.pricePerKilogram;
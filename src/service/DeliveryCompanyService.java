package Service;

import entities.Customer;
import entities.DeliveryCompany;
import entities.Order;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public class DeliveryCompanyService {
    private ArrayList<DeliveryCompany> deliveryCompanies = new ArrayList<>();


    public void acceptOrder(Order order, String company, String customer) {
        Optional<DeliveryCompany> optional = deliveryCompanies.stream().filter(x -> x.getDeliveryCompanyName().equalsIgnoreCase(company)).findFirst();

        if (optional.isPresent()) {
            if (order.getLoad().getHeight() * order.getLoad().getWidth() < DeliveryCompany.maxCapacityPerSquareMeter) {
                boolean resultFindCustomer = optional.flatMap(x -> x.getCustomer().stream().filter(a -> a.getName().equals(customer)).findFirst()).isPresent();
                if (resultFindCustomer)
                    optional.flatMap(x -> x.getCustomer().stream().filter(a -> a.getName().equals(customer)).findFirst()).ifPresent(b -> b.addOrder(order));
                else System.out.println("Customer l;ksajfnot found");
            } else System.out.println("Company cannot accept this order!");
        } else System.out.println("Company not found!");
    }
}
package entities;

import java.util.ArrayList;

public class DeliveryCompany {
    private String companyName;
    public static final int pricePerKilogram = 10;
    public static final int maxCapacityPerCubeSantimeter = 50;
    private ArrayList<Customer> list = new ArrayList<>();


    public DeliveryCompany(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }
}

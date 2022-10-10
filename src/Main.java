import Service.DeliveryCompanyService;
import entities.Customer;
import entities.DeliveryCompany;
import entities.Load;
import entities.Order;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    static final Scanner scannerS = new Scanner(System.in);
    static final Scanner scannerN = new Scanner(System.in);
    static final Scanner scannerA = new Scanner(System.in);

    public static void main(String[] args) {

        DeliveryCompanyService deliveryCompanyService = new DeliveryCompanyService();

        String button = "null";

        while(!button.equals("x")) {
            commands();
            button = scannerA.nextLine();
            switch (button) {
                case "1" -> {
                    try {
                        System.out.println("Write load's weight:");
                        int weight = scannerS.nextInt();
                        System.out.println("Write load's height:");
                        int height = scannerN.nextInt();
                        System.out.println("Write load's width:");
                        int width = scannerS.nextInt();

                        scannerN.nextLine();
                        System.out.println("Write company name:");
                        String companyName = scannerN.nextLine();
                        scannerS.nextLine();
                        System.out.println("Write customer name:");
                        String customerName = scannerS.nextLine();

                        deliveryCompanyService.acceptOrder(new Order(new Load(height, width, weight)), companyName, customerName);
                    } catch (InputMismatchException e) {
                        System.out.println("WRITE ONLY NUMBERS!!!");
                    }

                }
            }
        }
    }

    static void commands(){
        System.out.println("\n----------------------------------");
        System.out.println("Enter 1 to accept order");
        System.out.println("Enter 2 to creat delivery company");
        System.out.println("Enter 3 to see customer's total fee");
        System.out.println("Enter 4 to see company's profit");
        System.out.println("Enter 5 to create new customer");
        System.out.println("------------------------------------");
        System.out.println("Choose command:");

    }
}
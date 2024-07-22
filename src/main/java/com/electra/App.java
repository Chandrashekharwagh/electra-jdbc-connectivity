package com.electra;

import com.electra.service.*;
import java.io.IOException;
import java.util.Scanner;


public class App {

  public static final ConnectionService connectionService;

    static {
        connectionService = new ConnectionService();
    }

    public static void main(String[] args) throws IOException {

        AddressService addressService = new AddressService();
        BrandService brandService = new BrandService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        SupplierService supplierService = new SupplierService();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            //Runtime.getRuntime().exec("reset");
            System.out.println("*** ELECTRONIC BRAND MANAGEMENT ***");
            System.out.println("_______________________________");
            System.out.println("Select operation:");
            System.out.println("1. Create ");
            System.out.println("2. Retrieve ");
            System.out.println("3. Update ");
            System.out.println("4. Delete ");
            System.out.println("5. Retrieve Address");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Performing CREATE operation ");

                    break;
                case 2:
                    System.out.println("Performing READ operation ");
                    // Add your read logic here
                    break;
                case 3:
                    System.out.println("Performing UPDATE operation ");
                    // Add your update logic here
                    break;
                case 4:
                    System.out.println("Performing DELETE operation ");
                    // Add your delete logic here
                    break;
                case 5:
                    System.out.println("Performing RETRIEVE operation on Address..");

                    addressService.retrieveAddresses().forEach(address -> {
                        System.out.println
                                ("Address ID: " + address.getId()+
                                        " Street: "  + address.getStreet()+
                                        " City: " + address.getCity() +
                                        " State: " + address.getState()+
                                        " Country: "  + address.getCountry()+
                                        "Postal_code"+ address.getPostalCode());
                    });
                    break;

                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
        scanner.close();
    }
}

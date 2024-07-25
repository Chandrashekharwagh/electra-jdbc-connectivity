package com.electra;


import com.electra.model.Brand;
import com.electra.service.*;


import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;


public class App {

    private static final ConnectionService connectionService;

    static {
        connectionService = new ConnectionService();
    }

    public static void main(String[] args) throws IOException, SQLException {

        AddressService addressService = new AddressService();
        BrandService brandService = new BrandService();
        CustomerService customerService = new CustomerService();
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        SupplierService supplierService = new SupplierService();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int choice1 = 0;
        int choice2 = 0;
        int choice3 = 0;
        int choice4 = 0;
        do {
            //Runtime.getRuntime().exec("reset");
            System.out.println("*** ELECTRONIC BRAND MANAGEMENT ***");
            System.out.println("_______________________________");
            System.out.println("Select operation:");
            System.out.println("1. Create ");
            System.out.println("2. Update ");
            System.out.println("3. Delete ");
            System.out.println("4. Retrieve");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    System.out.println("Performing CREATE operation ");

                    do {
                        System.out.print("Enter which Entity you want to Create : ");
                        System.out.println("1. Customer ");
                        System.out.println("0. Exit");
                        choice1 = Integer.parseInt(scanner.nextLine());
                        switch (choice1) {

                            case 1:{
                                System.out.println("Performing CREATE operation on Customer ");
                                customerService.insertCustomer();

                                System.out.println("Now insert your address ");
                                addressService.insertAddress();
                            }
                            break;
                            case 2:{


                            }
                            break;
                        }
                    } while (choice1 != 0);
                    scanner.close();

                case 2:
                    System.out.println("Performing UPDATE operation ");
                    System.out.println("1. Customer ");
                    System.out.println("2. Address ");
                    System.out.println("0. Exit");

                    // Add your update logic here
                    do {
                        System.out.print("Enter which Entity you want to Update : ");
                        choice2 = Integer.parseInt(scanner.nextLine());
                        switch (choice2){

                            case 1: {
                                System.out.println("Updating Customer ");
                                customerService.updateCustomer();
                            }
                            break;
                            case 2: {
                                System.out.println("Updating Address ");
                                addressService.updateAddress();
                            }
                            break;
                        }

                    }while (choice2 != 0);
                    scanner.close();
                    break;

                case 3:
                    System.out.println("Performing DELETE operation ");
                    System.out.println("1. Customer ");
                    System.out.println("2. Address ");
                    System.out.println("0. Exit");
                    // Add your delete logic here
                    do {
                        System.out.print("Enter which Entity you want to Delete : ");
                        choice3 = Integer.parseInt(scanner.nextLine());
                        switch (choice3){
                            case 1:{
                                customerService.deleteCustomer();
                            }
                            break;
                            case 2:{
                                addressService.deleteAddress();

                            } break;
                        }

                    }while (choice3 != 0);
                    scanner.close();
                    break;

                case 4:
                    System.out.println("Performing RETRIEVE operation ");
                    System.out.println("1. Customer details ");
                    System.out.println("2. Address of customers");
                    System.out.println("3. Brands details ");

                    System.out.println("0. Exit");

                    System.out.print("Enter your choice: ");
                    choice4 = Integer.parseInt(scanner.nextLine());

                    switch (choice4) {
                        case 1: {
                            System.out.println("Retrieving Customers details ");

                            customerService.retrieveCustomers().forEach(customer -> {
                                System.out.println
                                        ("Customer Id: " + customer.getId() +
                                        " name: " + customer.getName() +
                                        " email: " + customer.getEmail());
                            });
                            break;
                        }

                        case 2: {
                            System.out.println("Retrieving Address of customers");
                            addressService.retrieveAddresses().forEach(address -> {
                                System.out.println
                                        ("Address ID: " + address.getId() +
                                                " Street: " + address.getStreet() +
                                                " City: " + address.getCity() +
                                                " State: " + address.getState() +
                                                " Country: " + address.getCountry() +
                                                "Postal_code" + address.getPostalCode());
                            });
                        }
                        break;
                        case 3:{
                            System.out.println("Retrieving Brands");
                            brandService.retrieveBrands().forEach(Brand -> {
                                System.out.println
                                        ("Brand ID: " + Brand.getId() +
                                                " name: " + Brand.getName() +
                                                " description: " + Brand.getDescription());
                            });

                        }
                        break;
                        case 0:
                            System.out.println("Exiting program");
                            break;
                        default:
                            System.out.println("Invalid choice");
                    }while (choice4 != 0);
                    scanner.close();
            }
        }while (choice != 0) ;
        scanner.close();
    }
}




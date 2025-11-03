package ie.atu.week7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ManagementApp {
    public static void main(String[] args) {
        int customerNum = 0;
        int i = 0;
        int choice = 1;
        Scanner scan1 = new Scanner(System.in);
        //Array Lis to house Customer information
        List<Customer> customerList = new ArrayList<>();
        //Bring up home page for user;
        while(choice == 1){
            System.out.println("===== Customer Management System =====");
            System.out.println("1) Add Customer");
            System.out.println("2) Update Customer");
            System.out.println("3) Display All");
            System.out.println("4) Exit");
            //Prompt user for desired operation
            System.out.println("Please enter which operation you would like: ");
            //Scan the user's input
            String operation = scan1.next();

            switch(operation){
                case"1" -> {
                    System.out.println("Please enter the number of customers you wish to add");
                    customerNum = scan1.nextInt();
                    scan1.nextLine();
                    while(i < customerNum){
                        Customer customer1 = new Customer();
                        System.out.println("Please enter the customer ID: ");
                        String customerId = scan1.nextLine();
                        System.out.println("Please enter the customer name: ");
                        String name = scan1.nextLine();
                        System.out.println("Please enter the customer email: ");
                        String email = scan1.nextLine();
                        System.out.println("Please enter the customer phone number: ");
                        String phoneNumber = scan1.nextLine();
                        System.out.println("------------------------------------------------");
                        customer1.setCustomerId(customerId);
                        customer1.setName(name);
                        customer1.setEmail(email);
                        customer1.setPhoneNumber(phoneNumber);
                        customerList.add(customer1);
                        i++;
                    }
                }
                case"2" -> {

                }
                case"3" -> {
                    int counter = 1;
                    for (Customer customer : customerList) {
                        System.out.println("Customer " + counter + ":");
                        System.out.println("Customer ID:" + customer.getCustomerId());
                        System.out.println("Customer Name:" + customer.getName());
                        System.out.println("Customer Email:" + customer.getEmail());
                        System.out.println("Customer Phone Number:" + customer.getPhoneNumber());
                        System.out.println("------------------------------------------------");
                        counter++;
                    }
                }
                case "4" -> {
                    System.out.println("Goodbye");
                }
                default -> {
                    System.out.println("Invalid Operation selected");
                }
            }
        }
    }
}
package ie.atu.week7;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ManagementApp {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        //Array Lis to house Customer information
        List<Customer> customerList = new ArrayList<>();
        //Bring up home page for user;
        System.out.println("===== Customer Management System =====");
        System.out.println("1) Add Customer");
        System.out.println("2) Update Customer");
        System.out.println("3) Display All");
        System.out.println("4) Exit");
        //Prompt user for desired operation
        System.out.println("Please enter which operation you would like: ");
        //Scan the user's input
        String operation = scan1.next();
        }
    }
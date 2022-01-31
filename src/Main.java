import BankSystem.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Joe", 454.33);
        customer1.addTransaction(73.9);
        Customer customer2 = new Customer("Goldberg", 4.33);
        Customer customer3 = new Customer("Love", 194.33);
        customer3.addTransaction(8.9);


        ArrayList<Customer> myList = new ArrayList<>();
        myList.add(customer1);
        myList.add(customer2);
        myList.add(customer3);

        Branch branch = new Branch("Jersey Branch",myList);

        System.out.println(branch);
    }
}

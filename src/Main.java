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

        customer1 = new Customer("yay", 4.89);
        customer1.addTransaction(73.9);
        customer2 = new Customer("Jake", 990.13);
        customer3 = new Customer("Corey", 4.33);
        customer3.addTransaction(2.9);



        System.out.println(branch);

        myList.add(customer1);
        myList.add(customer2);
        myList.add(customer3);
        Branch branch2 = new Branch("New York Branch",myList);

        ArrayList<Branch>t_list = new ArrayList<>();
        t_list.add(branch);
        t_list.add(branch2);

        Bank myBank = new Bank("UCBL",t_list);

        System.out.println(myBank);

    }
}

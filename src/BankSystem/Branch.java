package BankSystem;

import java.util.ArrayList;

public class Branch {
    private final String branchName;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();

    public Branch(String name, ArrayList<Customer> customerList) {
        this.branchName = name;
        this.customerList = customerList;
    }

    public void addCustomer(String name, double initialTransaction){
        Customer customer = new Customer(name,initialTransaction);
        this.customerList.add(customer);
    }

    public void addTransaction(Customer customer, double transaction){
        int customerIdx = customerList.indexOf(customer);
        customerList.get(customerIdx).addTransaction(transaction);
    }

    @Override
    public String toString(){
        String retString = branchName + "\n_____________\n";
        for(Customer i:customerList){
            retString += i.toString();
            retString += "\n";
        }
        return retString;
    }

    public String getBranchName() {
        return branchName;
    }
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
}

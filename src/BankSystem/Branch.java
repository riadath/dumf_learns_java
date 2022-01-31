package BankSystem;

import java.util.ArrayList;

public class Branch {
    private final String branchName;
    private ArrayList<Customer> customerList;

    public Branch(String name, ArrayList<Customer> customerList) {
        this.branchName = name;
        this.customerList = new ArrayList<>(customerList);
    }

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void addTransaction(String name, double transaction){
        int customerIdx = -1,idx = 0;
        for(Customer i : customerList){
            if(i.getName().equals(name)){
                customerIdx = idx;
                break;
            }
            idx++;
        }
        if(customerIdx == -1){
            Customer customer = new Customer(name,transaction);
            customerList.add(customer);
        }
        else{
            customerList.get(customerIdx).addTransaction(transaction);
        }
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

package BankSystem;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList;

    public Bank(String bankName, ArrayList<Branch> branchList) {
        this.bankName = bankName;
        this.branchList = new ArrayList<>(branchList);
    }

    public void addStuff(Branch branch){
        branchList.add(branch);
    }

    public void addStuff(Branch branch,Customer customer){
        int branchIdx = branchList.indexOf(branch);
        branchList.get(branchIdx).addCustomer(customer);
    }
    public void addStuff(Branch branch,Customer customer,double transaction){
        ArrayList<Customer> t_list = branchList.get(branchList.indexOf(branch)).getCustomerList();
        t_list.get(t_list.indexOf(customer)).addTransaction(transaction);
    }
    public void showCustomerDetails(Branch branch,Customer customer){
        ArrayList<Customer> t_list = branchList.get(branchList.indexOf(branch)).getCustomerList();
        System.out.println(t_list.get(t_list.indexOf(customer)).toString());
    }

    @Override
    public String toString(){
        String retString = bankName + "\n____________________\n";
        for(Branch i : branchList){
            retString += i.toString();
            retString += "\n";
        }
        return retString;
    }

    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public ArrayList<Branch> getBranchList() {
        return branchList;
    }
}

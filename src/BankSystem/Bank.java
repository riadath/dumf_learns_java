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

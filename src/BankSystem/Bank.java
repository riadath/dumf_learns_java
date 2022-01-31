package BankSystem;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchList = new ArrayList<>();

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

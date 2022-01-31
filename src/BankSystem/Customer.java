package BankSystem;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String name, double transaction) {
        this.name = name;
        this.transactions.add(transaction);
    }

    public void addTransaction(double transaction){
        this.transactions.add(transaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
    @Override
    public String toString(){
        return "Customer Name : " + name + "\nTransactions : " +(transactions);
    }
}

import java.util.ArrayList;

public class Customer {
 private String name;
 private ArrayList<Double> transactions;
  
 public Customer(String name,double initTrans){
     this.name=name;
     this.transactions=new ArrayList<>();
     transactions.add(initTrans);
 }
 public String getName(){
     return name;
 }
 public ArrayList<Double> getTransactions(){
     return transactions;
 }
 
 public void addTransaction(double transaction){
     transactions.add(transaction);
 }}

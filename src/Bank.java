import java.util.ArrayList;

public class Bank {
 private String name;
 private ArrayList<Branch> branches;
 public Bank(String name){
     this.name=name;
     branches=new ArrayList<>();
 }
  
 public boolean addBranch(String name){
     if(findBranch(name)==null){
         branches.add(new Branch(name));
         return true;   }
     return false; }
  
 public  boolean addCustomer(String branch_name,String cust_name,double initTrans){
   Branch branch=findBranch(branch_name);
   if(branch!=null){
 return branch.newCustomer(cust_name,initTrans); }
 return false;}
 
 public boolean addCustomerTransaction( String branch_name,String cust_name,double initTrans  ){
      Branch branch=findBranch(branch_name);
   if(branch!=null){
  return   branch.addCustomerTransaction(cust_name,initTrans);
 }
 return false;}
 
 
 public boolean listCustomers(String branch_name,boolean print){
     Branch branch=findBranch(branch_name);
     if(branch!=null ){
         System.out.println("Customer details for branch "+branch_name);
       for(int i=0;i<branch.getCustomers().size();i++){
           
       Customer customer=branch.getCustomers().get(i);
     System.out.println("Customer: " + customer.getName() + "[" + (i + 1) + "]");
           if(print){
                System.out.println("Transactions");
            for(int j=0;j<customer.getTransactions().size();j++){
                System.out.println("["+(j+1)+"] Amount "+customer.getTransactions().get(j));} } }     
       return true;   }
     return false; }
 
private Branch findBranch(String name){
    for(Branch branch:branches) {
        if(branch.getName().equals(name)){
            return branch;   }}
     return null;}}
 

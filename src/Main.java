public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("My Bank");
      
        bank.addBranch("Adelaide");
        bank.addBranch("Melbourne");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
      
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
        System.out.println("With transactions:");
        bank.listCustomers("Adelaide", true);
        System.out.println();
      
        System.out.println("Without transactions:");
        bank.listCustomers("Adelaide", false);
    }
}

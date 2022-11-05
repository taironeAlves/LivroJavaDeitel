package capitulo3;

public class Account {
   private String name;
   private double balance;

   // Metodo contrutor
   public Account(String name, double balance) {
      this.name = name;

      if (balance > 0.0) {
         this.balance = balance;
      }

   }

   // Metodo get deposito
   public double getBalance() {
      return balance;
   }

   public void deposit(double depositAmount) {
      if (depositAmount > 0.0) {
         balance += depositAmount;
      }
   }

   public void withDraw(double value) {

      double balance = getBalance();

      if (balance >= value) {
         this.balance = balance - value;
         System.out.println("withDraw success");

      } else {
         System.out.println("Withdrawal amount exceeded account balance");

      }
   }

   // method to set the name in the object
   public void setName(String name) {
      this.name = name; // store the name
   }

   // method to retrieve the name from the object
   public String getName() {
      return name; // return value of name to caller
   }
}

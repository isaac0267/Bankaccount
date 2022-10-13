/*
1- creat bank account object
2-a bank account object
3-A bank account and save and withdraw money
4-It can transfer money to other account
*/

public class Bank {
    // attribute
    private double balance;
    private String name;
// make a constructor
    public Bank(String name) {
        this.name = name;
        balance = 0.0;
    }

    // make method:
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
// make a method that call deposit.
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has $ " + balance);
    }
    // make another method that call withdraw. use the if and else if to make condition.

    public void withdaw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(name+" has $"+balance);
        }
        else{
            System.out.println("Withdrawal by"+" "+name+" "+"fails");
        }
    }
    // make method that call transfer. make also condition.
    public void transfer(double amonut,Bank acc){
        if(this.balance<amonut){
            System.out.println("Transfer fails");
        }
        else{
          this.balance-=amonut;
          acc.balance +=amonut;
            System.out.println("Account of"+" "+this.name+
                    " "+"becomes $"+this.balance);
            System.out.println("Account of"+" "+acc.name+
                   " " +"becomes $"+acc.balance);
        }

    }
}
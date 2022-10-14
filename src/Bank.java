/*
1- creat bank account object
2-a bank account object
3-A bank account and save and withdraw money
4-It can transfer money to other account
*/

public class Bank {  // we start making a Bank class. The data type have to be double. 
    // attribute
    private double balance;       
    private String name;
// make a constructor for the balance and the name. 
    public Bank(String name) {
        this.name = name;
        balance = 0.0;
    }

    // make method for get balance 
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
// make a method that call deposit. If the customer want to svae some money in the bank. 
    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has $ " + balance);
    }
    // make another method that call withdraw. use the if and else if to make condition. 

    public void withdaw(double amount) {
        if (amount <= balance) { // if the amonut is less or equeal to the balance. 
            balance -= amount;    
            System.out.println(name+" has $"+balance); // we make a sout to print the name of the account the balance. 
        }
        else{
            System.out.println("Withdrawal by"+" "+name+" "+"fails"); // if the customer have less money so he can not withdraw money. 
        }
    }
    // make method that call transfer. make also condition. we do the same as we did for withdraw money. 
    public void transfer(double amonut,Bank acc){
        if(this.balance<amonut){   // if the customer have less money than mount so he or she can not transfer money to other account. 
            System.out.println("Transfer fails");// sout that show the transfer is failes. 
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

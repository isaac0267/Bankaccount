public class Main {
    // This is the main class. Hear we run our program
    public static void main(String[] args) {
        Bank Isaac=new Bank("Isaac");
        Isaac.deposit(1000.0);
        Bank Wei= new Bank("Wei");
        Wei.deposit(200);
        Isaac.transfer(200,Wei);
        Wei.withdaw(200);
        Wei.withdaw(800);
        System.out.println(Wei.getBalance());



    }
}

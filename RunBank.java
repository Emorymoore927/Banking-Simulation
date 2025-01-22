/*
Description: This class is the interface that the user will see when interacting with this program.
 */
import java.util.Scanner;
public class RunBank {
    static int scan; // updated variable to static field access.

    public static void menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("***********************************************");
        System.out.println("\t  Moore Banking LLC Financial Services.\t\t");
        System.out.println("***********************************************");
        System.out.print("Options:\n");
        System.out.println("1. Savings Deposit\n" +
                "2. Savings Withdrawl\n" +
                "3. Checking Deposit\n" +
                "4. Write a Check\n" +
                "5. Credit Card Payment\n" +
                "6. Make a Charge\n" +
                "7. Display Savings\n" +
                "8. Display Checking\n" +
                "9. Display Credit Card\n" +
                "10. Exit\n");
        System.out.println("SELECT OPTION (1-10): ");
        scan = s.nextInt();
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);


        menu();




        Checking c1 = new Checking("My Checking", 234, 100 );

        Savings s1 = new Savings("My savings", 567,100 );

        CreditCard creditCard1= new CreditCard("My credit card", 8910, 100 );



        double doubleScan;

        int intScan;
        double intScan1;
        while (scan != 10) {


            switch (scan) {

                case 1:
                    System.out.println("How much would you like to deposit into the savings account? " +
                            "The current balance is: " + s1.getBalance());
                    doubleScan = s.nextDouble();
                    s1.makeDeposit(doubleScan);

                    menu();
                    break;

                case 2:
                    System.out.println("How much would you like to withdraw from the savings account?" +
                            " The current balance is: " +s1.getBalance());
                    doubleScan = s.nextDouble();
                    s1.doWithdraw(doubleScan);
                    menu();
                    break;

                case 3:
                    System.out.println("How much would you like to deposit into the checking account?" +
                            " The current balance is: " + c1.getBalance());
                    doubleScan = s.nextDouble();
                    c1.makeDeposit(doubleScan);
                    menu();
                    break;

                case 4:
                    System.out.println("Enter Check Number: ");
                    intScan = s.nextInt();
                    System.out.println("Enter Check amount: ");
                    doubleScan = s.nextDouble();
                    c1.WriteCheck(intScan, doubleScan);
                    break;


                case 5:
                    System.out.println("How much do you want to pay off of your credit card?"+
                            " The current balance is: "+ creditCard1.getBalance());
                    doubleScan = s.nextDouble();
                    creditCard1.makePayment(doubleScan);
                    menu();
                    break;

                case 6:
                    System.out.println("How much do you want to charge your credit card?"+
                            " The current balance is: "+ creditCard1.getBalance());
                    doubleScan = s.nextDouble();
                    creditCard1.debitCharge("item", doubleScan);
                    menu();
                    break;

                case 7:
                    System.out.println("Savings balance: " + s1.getBalance());
                    s1.display();
                    menu();
                    break;

                case 8:
                    System.out.println("Checking balance: " + c1.getBalance());
                    //doubleScan = s.nextDouble();
                    c1.display();
                    menu();
                    break;

                case 9:
                    //doubleScan = s.nextDouble();
                    System.out.println("Credit card balance:" + creditCard1.getBalance());
                    creditCard1.display();
                    menu();
                    break;
            }
        }

    /*//This is the options display that the user will choose their actions from.
    public static void menu(){
        System.out.println("***********************************************");
        System.out.println("\t  Moore Banking LLC Financial Services.\t\t");
        System.out.println("***********************************************");
        System.out.print("Options:\n");
        System.out.println("1. Savings Deposit\n" +
                "2. Savings Withdrawl\n" +
                "3. Checking Deposit\n" +
                "4. Write a Check\n" +
                "5. Credit Card Payment\n" +
                "6. Make a Charge\n" +
                "7. Display Savings\n" +
                "8. Display Checking\n" +
                "9. Display Credit Card\n" +
                "10. Exit\n");
        System.out.println("SELECT OPTION (1-10): ");
    }

    public static void main(String[] args){

        //Implements the menu method defined above.
        menu();

        //Creates a new Scanner object called s
       Scanner s= new Scanner(System.in);

       //Creates a new Checking object called c1.
       Checking c1 = new Checking("My Checking", 234, 100 );

       //Creates a new Savings object called s1.
       Savings s1 = new Savings("My savings", 567,100 );

       //Creates a new CreditCard object called creditCard1.
       CreditCard creditCard1= new CreditCard("My credit card", 8910, 100 );

       int scan = s.nextInt();

       //A variable called doubleScan that will be used to hold a double scan value.
       double doubleScan;

       //A variable called intScan that will be used to hold an int scan value.
       int intScan;

       //This switch "loop" is used to go through the different options that the user can pick.
        //Based on the value entered, that specific case will be implemented while the others are skipped.
       switch (scan){

           case 1:
               System.out.println("Enter a savings account deposit amount.");
               doubleScan= s.nextDouble();
               s1.makeDeposit(doubleScan);
               break;

           case 2:
               System.out.println("Enter a savings account withdrawl amount.");
               doubleScan= s.nextDouble();
               s1.doWithdraw(doubleScan);
               break;

           case 3:
               System.out.println("Enter a checking account deposit amount.");
               doubleScan=s.nextDouble();
               c1.makeDeposit(doubleScan);
               break;

           case 4:
               System.out.println("Enter check value.");
               intScan= s.nextInt();
               c1.writeCheck(1, intScan); //should checkNUm be lastTenChecks??
               break;

           case 5:
               System.out.println("Enter credit card payment amount.");
               doubleScan=s.nextDouble();
               creditCard1.makePayment(doubleScan);
               break;

           case 6:
               System.out.println("Enter credit card charge amount.");
               doubleScan=s.nextDouble();
               creditCard1.debitCharge("item", doubleScan);
               break;

           case 7:
               System.out.println("Savings balance: ");
               s1.display();
               break;

           case 8:
               System.out.println("Checking balance: ");
               doubleScan=s.nextDouble();
               c1.display();
               break;

           case 9:
               System.out.println("Credit card balance:");
               doubleScan=s.nextDouble();
               creditCard1.display();
               break;

           case 10:
               break;
       }*/

        /* *//*int CheckingBalance= 100;
        int SavingsBalance= 100;
        int CreditCardBalance= 100;*//*
        //do i put the menu method here--the method that prints everything out

        Scanner scan= new Scanner(System.in);
        int i, value= 0;
       // i= scan.nextInt(); //if statements? if i=5 then make a credit card object?
        //while(i!=10){

        //}

        //Checking account
        Checking c1 = new Checking();
        // Use a scan to make amounts entered dynamically.
        c1.setName("Hannah"); //instead of hannah would i put i=scan.nextInt...
        c1.setBalance(100); // fixed valued added
        c1.setTaxID(665);

        System.out.print("Name: " + c1.getName());
        System.out.println( "Checking Balance: " + c1.getBalance());
        System.out.println("Tax ID: " + c1.getTaxID());



        //Savings account
        Savings s1 = new Savings();

        s1.setBalance(100);
        s1.setName("Lily");
        s1.setTaxID(5565);

        System.out.println(s1.getBalance());
        System.out.println(s1.getName());
        System.out.print(s1.getTaxID());

        //Credit card account
        CreditCard cC1= new CreditCard();

        cC1.setBalance(100);
        cC1.setName("Joe");
        cC1.setTaxID(5656);

        System.out.print(cC1.getBalance());
        System.out.println(cC1.getName());
        System.out.println(cC1.getTaxID());

        menu();
        //i= scan.nextInt();*/
    }
}

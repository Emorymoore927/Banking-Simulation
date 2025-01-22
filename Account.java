/*
Name: Emory Moore
Date: 2/13/2023
Class: CSC 1120
Pledge: I have neither given or received unauthorized aid on this program.
Description: The bank Account class allows for updates and modifications to the child classes.
Input: the user types commands to pick one of the ten options listed. Based off the option they choose, the user enters
a number that represents either a deposit, withdraw, or charge.
Output: The program will display the rolling balance of each of the classes.
*/

public class Account {
    protected String name;
    protected long taxID;
    protected double balance;
    protected double[] last10Withdraws;
    protected double[] last10Deposits;
    protected int numDeposits;
    protected int numWithdraws;

    //General constructor for the Account class
    public Account(){
        name= "N/A";
        taxID=0;
        balance= 0;
        last10Deposits= new double[10];
        last10Withdraws= new double[10];
        numDeposits= 0;
        numWithdraws= 0;
    }

    //Specific constructor for the Account class
    public Account(String theName, long theTaxID, double theBalance){
        name= theName;
        taxID= theTaxID;
        balance= theBalance;
        last10Deposits= new double[10];
        last10Withdraws= new double[10];
        numDeposits= 0;
        numWithdraws=0;
    }


    //Mutator methods.
    public void setName(String newName){
        name=newName;
    }

    public void setTaxID(long newTaxID){
        taxID= newTaxID;
    }

    public void setBalance(double newBalance){
        balance= newBalance;
    }

    //Accessor methods.
    public String getName(){
        return name;
    }

    public long getTaxID(){
        return taxID;
    }

    public double getBalance(){
        return balance;
    }

    //Adds items to a double[] array.
    public void addToArray(double[] array, double amount){
        for(int i= array.length-1; i>=1; i -=1){
            array[i]= array[i-1];
        }
        array[0]=amount;
    }

    //Adds the specified amount to the balance and then adds that value to the last10Deposits array.
    public void makeDeposit(double amount){
      if(amount >=0 && amount<=10000){
          balance=balance + amount;
          addToArray(last10Deposits, amount);
      } else{
          System.out.print("Please enter a valid deposit amount between 0 and 10000 ");
      }
    }

    //Prints the name, taxID, and balance of the account.
    public void display(){
        System.out.println("Name: " + name);

        System.out.print("TaxID: " + taxID);

        System.out.print("Balance:" + balance);
    }
}

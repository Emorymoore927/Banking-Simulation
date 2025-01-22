/*
Description: This is a child class of the Account parent class.
 */

public class Savings extends Account {

    //General constructor for the Savings class.
    public Savings(){
        name= "N/A";
        taxID=0;
        balance= 0;
        last10Deposits= new double[10];
        last10Withdraws= new double[10];
        numDeposits= 0;
        numWithdraws= 0;
    }

    //Specific constructor for the Savings class.
    public Savings(String name2, long taxID2, double balance2){
        name= name2;
        taxID= taxID2;
        balance= balance2;
        last10Deposits= new double[10];
        last10Withdraws= new double[10];
        numDeposits= 0;
        numWithdraws= 0;
    }

    //Withdraws the specified amount, subtracts it from the balance, and adds the amount to its respective array.
    public void doWithdraw(double amount){
        if(amount >=0 && amount<=10000){
            balance= balance-amount;

            addToArray(last10Withdraws, amount);
        } else{
            System.out.print("Please withdraw a vaild amount between 0 and 10000");
        }

    }

    //Displays the withdraws and deposits arrays.
    public void display(){
        for (int i=0; i< last10Withdraws.length; i++ ){
            System.out.println("Withdraws: " + last10Withdraws[i]);
        }
        for (int i=0; i< last10Deposits.length; i++){
            System.out.println("\tDeposits: " + last10Deposits[i]);
        }
    }
}

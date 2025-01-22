/*
Description: This is a child class of the Account parent class.
 */
public class CreditCard extends Account {

    private long cardNumber;
    private String[] last10Charges;

    //General constructor for the CreditCard class.
    public CreditCard(){
    }

    //Specific constructor for the CreditCard class.
    public CreditCard(String name1, long taxID1, double balance1){
        name= name1;
        taxID= taxID1;
        balance= balance1;
        last10Deposits= new double[10];
        last10Withdraws= new double[10];
        last10Charges = new String[10];
        numDeposits= 0;
        numWithdraws= 0;
    }

    //Adds items to a String[] array.
    public void addToArray(String[] array, String name){
        for(int i= array.length-1; i>=1; i -=1){
            array[i]= array[i-1];
        }
        array[0]=name;
    }

    //Subtracts the value specified from the balance and adds the name and amount to their respective arrays.
    public void debitCharge(String name, double amount){
        if(amount>=0 && amount<=10000){
            balance=balance+amount;
            addToArray(last10Charges, name);
        } else{
            System.out.print("Please enter a valid amount between 0 and 10000 ");
        }
    }

    //Adds the amount to the balance and adds the value to its specified array.
    public void makePayment(double amount){
        if(amount>=0 && amount<=10000){
            balance=balance-amount;
            addToArray(last10Withdraws, amount);
        } else{
            System.out.print("Please make a valid payment between 0 and 10000");
        }

    }

    //Displays the charges, withdraws, and deposits arrays.numWithdraws
    public void display(){
        for (int i=0; i< last10Charges.length; i++ ){
            System.out.println("Charges: " + last10Charges[i] +
                    "\tWithdraws: " + last10Withdraws[i]);
        }
    }
}

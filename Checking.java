/*
Description: This is a child class of the Account parent class.
 */
public class Checking extends Account {

    private int[] last10Checks;
    //array of the last 10 checking amounts
    protected double[] last10checkwrote;
    private int checknum;

    //General constructor for the Checking class.
    public Checking(){
        name= "N/A";
        taxID=0;
        balance= 0;
        last10Deposits= new double[10];
        last10Withdraws= new double[10];
        last10checkwrote = new double[10];
        last10Checks = new int [10];

        numDeposits= 0;
        numWithdraws= 0;
    }

    //Specific constructor for the Checking class.
    public Checking(String updatedName, long updatedTaxID, double updatedBalance){
        name= updatedName;
        taxID= updatedTaxID;
        balance= updatedBalance;
        last10Deposits= new double[10];
        last10Withdraws= new double[10];
        last10checkwrote = new double[10];

        numDeposits= 0;
        numWithdraws= 0;
    }

    //Adds items to an int[] array.
    public void addToArray(int[] array, int amount){
        for(int i= array.length-1; i>=1; i -=1){
            array[i]= array[i-1];
        }
        array[0]=amount;
    }

    public void addToArray1(int[] array, int checknum) {
        for (int i = array.length - 1; i >= 1; i -= 1) {
            array[i] = array[i - 1];
        }
        array[0] = checknum;
    }

    //Adds the specified checknumber and amount to their respective arrays and adjusts the overall balance.
        public void WriteCheck(int checkNum, double amount) {
            if((amount >= 0) && (amount <= 100000) && (balance >= amount))
            {
                balance -= amount;
                //addToArray(last10Checks, checkNum);
                //addToArray(last10Withdraws, amount);
                last10Withdraws[numWithdraws]=amount;
                last10Checks[numWithdraws]= checkNum;
                numWithdraws++;
                //checknum = n;
                //addToArray(last10Checks, n);
                //addToArray(last10checkwrote, amount);

            }
            else
            {
                System.out.println("Please enter a check amount between 0 and 100000.");
            }

        }


    //Displays the checks, withdraws, and deposits arrays.
    public void display(){
        for (int i=0; i< last10checkwrote.length; i++ ){
            System.out.println("Check number: " + last10checkwrote[i] +
                    "\tAmount: " + last10Withdraws[i]);
        }
        for (int i=0; i< last10Deposits.length; i++){
            System.out.println(last10Deposits[i]);
        }
    }
}

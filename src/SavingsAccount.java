public class SavingsAccount extends Accounts{

    // ATRIBUTES
    private float interesRate;

    // CONSTRUCTORS
    public SavingsAccount() {}
    public SavingsAccount(int accountNumber, float balance, String ownerName, float interesRate) {
        super(accountNumber, balance, ownerName);
        this.interesRate = interesRate;
    }
    
    // GETTERS
    public float getInteresRate() {return interesRate;}

    // SETTERS
    public void setInteresRate(float interesRate) {this.interesRate = interesRate;}

    // METHODS
    @Override
    public void withdraw(Float amount){
        if (amount>getBalance()){ 
            System.out.println("the withdraw is not possible, not enough founds");
        }else{
            super.withdraw(amount);
        }
    }


}

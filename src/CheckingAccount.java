public class CheckingAccount extends Accounts{

    // ATRIBUTES
    private float overdraftLimit;

    // CONSTRUCTOR
    public CheckingAccount() {}

    public CheckingAccount(int accountNumber, float balance, String ownerName, float overdraftLimit) {
        super(accountNumber, balance, ownerName);
        this.overdraftLimit = overdraftLimit;
    }

    // GETTERS
    public float getOverdraftLimit() {return overdraftLimit;}

    // SETTERS
    public void setOverdraftLimit(float overdraftLimit) {this.overdraftLimit = overdraftLimit;}
    
    // METHODS
    @Override
    public void withdraw(Float amount){
        if ((getBalance()-amount)<(overdraftLimit*-1)){ // no es la suma, es la diferencia!
            System.out.println("No puede hacer el retiro. Fondos insuficientes.");
        } else{
            super.withdraw(amount);
        }
    }

}

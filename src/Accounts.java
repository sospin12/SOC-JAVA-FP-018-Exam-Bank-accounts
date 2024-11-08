public class Accounts {
    private int accountNumber;
    private float balance;
    private String ownerName;
    protected float maxOverdraft;
    protected float minValance;
    private int totalAccounts;

    // CONSTRUCTOR
    public Accounts(){}

    public Accounts(int accountNumber, float balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        totalAccounts++;
    }  

    //GETTERS
    public float getBalance() {return balance;}
    public String getOwnerName() {return ownerName;}
    public int getTotalAccounts() {return totalAccounts;}
    public int getAccountNumber() {return accountNumber;}


    // METHODS
    public void deposit(Float amount){
        this.balance+= amount;
        System.out.println("\nDeposit succesfull!");
        System.out.println("Current balance: "+ this.balance);
    }
    public void withdraw(Float amount){
        this.balance-=amount;
        System.out.println("Withdraw Succesfull!");
        System.out.println("Current balance: "+ this.balance);
    }




    
}

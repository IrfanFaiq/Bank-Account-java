public class BankAccount {

    //private fields for the accounts and balance
    private final String accountNumber;
    private double balance;

    //constructor to initiallize account number and balance
    public BankAccount(String accountNumber, double initialBalance){
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    //getter method for account number
    public String getAccountNumber(){
        return accountNumber;
    }

    //getter for balance
    public double getBalance(){
        return balance;
    }

    //method to deposit money into bank
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposited : "+ amount);
        }else {
            System.out.println("Invalid dep num");
        }
    }

    //method to withdraw money into the account
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("withdraw : RM "+ amount);
        }else {
            System.out.println("Invalid pak tony money");
        }
    }

    public static void main(String[] args) {
        //create a bankaccount object with acc number "123456789" and initial of $1000
        BankAccount account = new BankAccount("123456789", 1000);

        //display the account number and initial balance
        System.out.println("Account number : "+ account.getAccountNumber());
        System.out.println("Initial balance : "+ account.getBalance());

        //deposit $500 into acc
        account.deposit(500);
        System.out.println("Balance after dep is : RM "+ account.getBalance());

        //withdraw 200 from acc
        account.withdraw(200);
        System.out.println("balance after withdrawal : "+ account.getBalance());

        //Attempt to withdraw $2000 (more than) from the account
        account.withdraw(2000);
    }
}

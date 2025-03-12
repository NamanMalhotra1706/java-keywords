class BankAccount{
    private static String bankName = "BOI";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(int accountNumber, String accountHolderName, double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts+=1;
    }

    public void displayAccountDetails(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance : Rs."+balance);
    }

    static int getTotalAccounts(){
        return  totalAccounts;
    }
}
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(101,"Naman Malhotra", 15000000);

        BankAccount account2 = new BankAccount(102,"Manvi Grover", 250000000);

        account1.displayAccountDetails();
        account2.displayAccountDetails();

        System.out.println("Account Open: "+BankAccount.getTotalAccounts());
    }
}

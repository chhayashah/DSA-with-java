public class BankAccount {
    private int accountNumber;
    private String holderName;
    private int balance;

    public BankAccount(int accountNumber,String holderName,int balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
    public int getAccountNumber(){
        return accountNumber;

    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    public String getHolderName(){
        return holderName;
    }
    public void setHolderName(String holderName){
        this.holderName=holderName;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public static void main(String[] args){
        BankAccount ba = new BankAccount(101, "chhaya", 60000);
        ba.setBalance(60000);
        System.out.println(ba.getBalance());
    }
}

package entities;

public class BankAccount {
    private int accountNumber;
    private String cardholderName;
    private double depositAmount;
    private  double balance;
    public BankAccount(){

    }

    public BankAccount(int accountNumber, String cardholderName, double depositAmount, double balance) {
        this.accountNumber = accountNumber;
        this.cardholderName = cardholderName;
        this.depositAmount = depositAmount;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
        getBalance(depositAmount);
    }

    public void setDepositAmount() {
        this.depositAmount = 0;
        getBalance(depositAmount);
    }

    public void getBalance(double valueDeposit ) {
        balance += depositAmount;
    }

    public double sake(double valueSke){
        double tax = 5.00;
        return balance -= valueSke + tax;
    }
    
    public void updateCardholderName(String name){
        cardholderName = name;
    }


    public String toString(){
        return "_____________________________\n"
                +"N° da conta: "
                + accountNumber +"\n"
                + "Titular: "
                + cardholderName+ "\n"
                + "Saldo " + balance + "\n" +
                "_______________________________";
    }
}

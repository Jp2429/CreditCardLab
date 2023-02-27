public class DebitCard extends PaymentCard implements IChargeable{

    private int accountNumber;
    private String sortCode;
    private int balance;

    public DebitCard(int cardNumber, String expDate, int securityNumber, int accountNumber, String sortCode,int balance) {
        super(cardNumber, expDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance=balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String charge(int value) {
        if(value<this.balance){
            this.balance-=value;
            return "Debit card has been used to pay";
        }
        return null;

    }
}

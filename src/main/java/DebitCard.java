public class DebitCard extends PaymentCard implements IChargeable{

    private int accountNumber;
    private String sortCode;

    public DebitCard(int cardNumber, int expDate, int securityNumber, int accountNumber, String sortCode) {
        super(cardNumber, expDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    @Override
    public boolean charge(int value) {
        return false;
    }
}

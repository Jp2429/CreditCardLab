public class CreditCard extends PaymentCard implements IChargeable {
    private int availableCredit;

    public CreditCard(int cardNumber, int expDate, int securityNumber, int availableCredit) {
        super(cardNumber, expDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    @Override
    public boolean charge(int value) {
        return false;
    }
}

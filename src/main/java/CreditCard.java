public class CreditCard extends PaymentCard implements IChargeable {
    private int availableCredit;

    public CreditCard(int cardNumber, String expDate, int securityNumber, int availableCredit) {
        super(cardNumber, expDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public int getAvailableCredit() {
        return availableCredit;
    }

    @Override
    public String charge(int value) {
        double transactionCost=value*1.1;
        if(transactionCost<this.availableCredit){
            this.availableCredit-=transactionCost;
            return "true";
        }
        return null;

    }
}

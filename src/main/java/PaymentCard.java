public abstract class PaymentCard {
    private int cardNumber;
    private String expDate;
    private int securityNumber;

    public PaymentCard(int cardNumber,String expDate,int securityNumber){
        this.cardNumber=cardNumber;
        this.expDate=expDate;
        this.securityNumber=securityNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }
}

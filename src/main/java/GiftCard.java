public class GiftCard implements IChargeable{
    private int balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }

    @Override
    public String charge(int value) {
        if (value > this.balance) { return "error"; }
        return this.log(value);
    }
    public int getBalance(){
        return this.balance;
    }

    public String log(int charge){
        String logMessage = "";
        logMessage.concat("\n Charging amount: " + String.valueOf(charge));
        logMessage.concat("\n Balance after transaction: " + this.balance);

        return logMessage;
    }
}

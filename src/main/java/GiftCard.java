public class GiftCard implements IChargeable{
    private int balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean charge(int value) {
        return false;
    }
    public int getBalance(){
        return this.balance;
    }
}

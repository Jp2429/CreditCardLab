public class GiftCard implements IChargeable{
    private int balance;

    public GiftCard(int balance) {
        this.balance = balance;
    }

    @Override
    public String charge(int value) {
        return null;
    }
}

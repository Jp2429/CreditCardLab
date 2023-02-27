import java.util.ArrayList;

public class Wallet{
    private ArrayList<IChargeable> cards;
    private IChargeable selectedCard;

    public Wallet(){
        this.cards=new ArrayList<>();
        this.selectedCard=null;

    }
}

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Wallet{
    private ArrayList<IChargeable> cards;
    private IChargeable selectedCard;

    public Wallet(){
        this.cards=new ArrayList<>();
        this.selectedCard=null;
    }

    public ArrayList<IChargeable> getCards() {
        return this.cards;
    }
    public int getCardCount(){
        return this.cards.size();
    }
    public void addCard(IChargeable card) {
        this.cards.add(card);
    }
    public void selectCard(IChargeable card){
        int index = this.cards.indexOf(card);
        this.selectedCard = this.cards.get(index);
    }

    public IChargeable getSelectedCard() {
        return selectedCard;
    }
    public void pay(int amount){
        this.selectedCard.charge(amount);
    }
}

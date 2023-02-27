import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    Wallet johnsWallet;
    GiftCard MandS;
    CreditCard amex;
    DebitCard Bos;

    @Before
    public void before(){
        johnsWallet = new Wallet();
        MandS = new GiftCard(50);
        amex = new CreditCard(5555, "10/02/2023", 4444, 2000);
        Bos = new DebitCard(5555, "20/12/2023", 4444, 5555, "EH6 8NR", 500);
    }
    @Test
    public void giftCardAdds(){
        johnsWallet.addCard(MandS);
        assertEquals(1, johnsWallet.getCardCount());
    }

    @Test
    public void changeSelectedCard(){
        johnsWallet.addCard(amex);
        johnsWallet.selectCard(amex);
        assertEquals(amex, johnsWallet.getSelectedCard());
    }

    


}

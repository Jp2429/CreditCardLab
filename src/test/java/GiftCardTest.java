import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard thanksGran;

    @Before
    public void before(){
        thanksGran = new GiftCard(50);
    }
    @Test
    public void hasBalance(){
        int result = thanksGran.getBalance();
        assertEquals(50, result);
    }
    @Test
    public void checkLog(){
        assertEquals(String.class, thanksGran.charge(5).getClass());
    }

}

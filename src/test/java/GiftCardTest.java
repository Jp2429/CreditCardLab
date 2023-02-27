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
        assertEquals(50, thanksGran.getBalance());
    }
    @Test
    public void checkLog(){

        assertEquals(String.class, thanksGran.charge(5).getClass());
    }

}

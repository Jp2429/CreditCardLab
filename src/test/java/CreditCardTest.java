import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    private CreditCard creditCard;

    @Before
    public void before(){
        creditCard=new CreditCard(123,"23/04/2023",12,3000);
    }
    @Test
    public void canGetCardNumber(){
        assertEquals(123,creditCard.getCardNumber());
    }
    @Test
    public void canGetExpDate(){
        assertEquals("23/04/2023",creditCard.getExpDate());
    }
    @Test
    public void canGetSecurityNumber(){
        assertEquals(12,creditCard.getSecurityNumber());
    }
    @Test
    public void canGetAvailableCredit(){
        assertEquals(3000,creditCard.getAvailableCredit());
    }

}

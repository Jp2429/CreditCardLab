import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    private DebitCard debitCard;
    @Before
    public void before(){
        debitCard=new DebitCard(123,"21/02/2023",13,987,"20-48-12",10000);
    }
    @Test
    public void canGetAccountNumber(){
        assertEquals(987,debitCard.getAccountNumber());
    }
    @Test
    public void canGetSortCode(){
        assertEquals("20-48-12",debitCard.getSortCode());
    }
    @Test
    public void canGetBalance(){
        assertEquals(10000,debitCard.getBalance());
    }
    @Test
    public void canCharge(){
        assertEquals("Debit card has been used to pay",debitCard.charge(50));
        assertEquals(9950,debitCard.getBalance());
    }
}

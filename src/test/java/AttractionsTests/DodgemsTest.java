package AttractionsTests;

import Attractions.Dodgems;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    private Dodgems dodgems;
    private Visitor youngVisitor;
    private Visitor oldVisitor;

    @Before
    public void before(){
        dodgems = new Dodgems("dodgems", 7, 5.0);
        youngVisitor = new Visitor(10, 100, 10.0);
        oldVisitor = new Visitor(20, 170, 10.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(5.0, dodgems.getPrice(), 0.1);
    }

    @Test
    public void willReturnHalfPriceTicket(){
        assertEquals(2.5, dodgems.priceFor(youngVisitor), 0.1);
    }

    @Test
    public void willReturnFullPriceTicket(){
        assertEquals(5.0, dodgems.priceFor(oldVisitor), 0.1);
    }


}

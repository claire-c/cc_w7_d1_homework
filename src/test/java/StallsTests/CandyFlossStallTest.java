package StallsTests;

import Stalls.CandyFlossStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    private CandyFlossStall candyFlossStall;
    private Visitor visitor;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("candy", "Claire", 2, 2, 4.0);
        visitor = new Visitor(8, 75, 5.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(4.0, candyFlossStall.priceFor(visitor), 0.1);
    }

    @Test
    public void canGetFunRating(){
        assertEquals(2, candyFlossStall.getFunRating());
    }


}

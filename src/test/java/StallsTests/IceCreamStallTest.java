package StallsTests;

import Stalls.IceCreamStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    private IceCreamStall iceCreamStall;
    private Visitor visitor;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("stall", "Joe", 1, 3, 3.0);
        visitor = new Visitor(18, 150, 10.0);
    }

    @Test
    public void canGetPrice(){
        assertEquals(3.0, iceCreamStall.priceFor(visitor), 0.1);
    }


    @Test public void canGetParkingSpot(){
        assertEquals(1, iceCreamStall.getParkingSpot());
    }

    @Test
    public void canGetFunRating(){
        assertEquals(3, iceCreamStall.getFunRating());
    }



}

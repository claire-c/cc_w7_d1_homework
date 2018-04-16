package StallsTests;

import Stalls.CancerStickStall;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CancerStickStallTest {

    private CancerStickStall smokingStall;
    private Visitor youngVisitor;
    private Visitor oldVisitor;

    @Before
    public void before(){
        smokingStall = new CancerStickStall("smoking", "Phillis", 3, 0, 10.0);
        youngVisitor = new Visitor(10, 100, 10.0);
        oldVisitor = new Visitor(20, 200, 20.0);
    }

    @Test
    public void notAllowedVisitorTooYoung(){
        assertFalse(smokingStall.isAllowedTo(youngVisitor));
    }

    @Test
    public void allowedToBuyVisitorOldEnough(){
        assertTrue(smokingStall.isAllowedTo(oldVisitor));
    }

    @Test
    public void canGetPrice(){
        assertEquals(10.0, smokingStall.priceFor(oldVisitor), 0.1);
    }




}

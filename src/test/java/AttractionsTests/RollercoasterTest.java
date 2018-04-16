package AttractionsTests;

import Attractions.Rollercoaster;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    private Rollercoaster rollercoaster;
    private Visitor shortVisitor;
    private Visitor tallVisitor;
    private Visitor oldVisitor;
    private Visitor youngVisitor;
    private Visitor youngVisitor2;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("rollercoaster", 9, 7.0);
        shortVisitor = new Visitor(20, 140, 10.0);
        tallVisitor = new Visitor(21, 150, 20.0);
        oldVisitor = new Visitor(40, 160, 40.0);
        youngVisitor = new Visitor(10, 150, 10.0);
        youngVisitor2 = new Visitor(12, 130, 20.0);

    }

    @Test
    public void canGetName(){
        assertEquals("rollercoaster", rollercoaster.getName());
    }

    @Test
    public void canGetPriceForVisitor(){
        assertEquals(7.0, rollercoaster.priceFor(tallVisitor), 0.1);
    }

    @Test
    public void canGetPriceForYoungVisitor(){
        assertEquals(3.5, rollercoaster.priceFor(youngVisitor), 0.1);
    }

//    @Test
//    public void cannotGetPriceForVisitorTooYoung(){
//
//    }
//
//    @Test
//    public void cannotGetPriceForVisitorTooShort(){
//
//    }



}

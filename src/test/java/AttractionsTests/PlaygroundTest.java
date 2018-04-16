package AttractionsTests;

import Attractions.Playground;
import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {

    private Playground playground;
    private Visitor youngVisitor;
    private Visitor oldVisitor;

    @Before
    public void before(){
        playground = new Playground("playground", 6);
        youngVisitor = new Visitor(10, 100, 10.0);
        oldVisitor = new Visitor(20, 170, 50.0);
    }

    @Test
    public void canGetName(){
        assertEquals("playground", playground.getName());
    }

    @Test
    public void canGetFunRating(){
        assertEquals(6, playground.getFunRating());
    }

    @Test
    public void visitorCanAccessPlayground(){
        assertTrue(playground.isAllowedTo(youngVisitor));
    }

    @Test
    public void visitorCannotAccessPlayground(){
        assertFalse(playground
        .isAllowedTo(oldVisitor));
    }


}

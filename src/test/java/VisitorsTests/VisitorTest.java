package VisitorsTests;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    private Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(15, 150, 25.0);
    }

    @Test
    public void getAge(){
        assertEquals(15, visitor.getAge());
    }


}

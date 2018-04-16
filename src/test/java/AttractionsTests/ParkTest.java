package AttractionsTests;

import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    private Park park;

    @Before
    public void before(){
        park = new Park("park", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("park", park.getName());
    }

    @Test
    public void canGetFunRating(){
        assertEquals(5, park.getFunRating());
    }


}

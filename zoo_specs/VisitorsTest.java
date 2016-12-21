import zoo.*;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 16/12/2016.
 */

public class VisitorsTest {
    Visitors visitors;

    @Before
    public void before(){
        visitors = new Visitors();
    }

    @Test
    public void numberOfVisitorsStartEmpty(){
    assertEquals(0,visitors.getNumberOfVisitors());
    }

    @Test
    public void numberOfVisitorsCanIncrease(){
        visitors.addVisitors();
    assertEquals(1,visitors.getNumberOfVisitors());
    }
 
}
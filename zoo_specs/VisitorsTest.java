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
    assertEquals(0,visitors.getTotalNumberOfVisitors());
    }

    @Test
    public void numberOfAdultVisitorsCanIncrease(){
        visitors.addAdultVisitors();
    assertEquals(1,visitors.getTotalNumberOfVisitors());
    assertEquals(1,visitors.getNumberOfAdultVisitors());
    assertEquals(0,visitors.getNumberOfDiscountVisitors());
    }

    @Test
    public void numberOfDiscountVisitorsCanIncrease(){
        visitors.addDiscountVisitors();
    assertEquals(1,visitors.getTotalNumberOfVisitors());
    assertEquals(0,visitors.getNumberOfAdultVisitors());
    assertEquals(1,visitors.getNumberOfDiscountVisitors());

    }

    @Test
    public void visitorsCanBuyTickets(){
        visitors.addAdultVisitors();
        visitors.addDiscountVisitors();
        visitors.incomeSellingTickets();
    assertEquals(15,visitors.incomeSellingTickets());
    }


    @Test 
    public void asDayliOutCome(){
        visitors.dayliOutcome();
    assertEquals(120,visitors.dailyOutcome());
    }

    @Test 
    public void asProfit(){
        visitors.addAdultVisitors();
        visitors.incomeSellingTickets();
        visitors.dayliOutcome();
    assertEquals(-110,visitors.profit());
    }

}
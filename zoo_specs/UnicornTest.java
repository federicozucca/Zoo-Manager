package zoo;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 16/12/2016.
 */

public class UnicornTest {
    Unicorn unicorn;

    @Before
    public void before(){
        unicorn = new Unicorn("Visalth Champion Of The Skies", 8);
    }

    @Test
    public void hasName(){
        assertEquals("Visalth Champion Of The Skies", unicorn.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(8, unicorn.getAge());
    }

    @Test
    public void canFly(){
        assertEquals(unicorn.fly(),"I like to fly with my friends :D");
    }

    @Test
    public void canGallop(){
        assertEquals(unicorn.gallop(),"clop, clop");
    }

    @Test
    public void bellyStartsEmptyTest(){
        assertEquals(0,unicorn.foodCount());
    }

    @Test
    public void canEatFood(){
        Food food = new Food("salmon");
        unicorn.eat(food);
        assertEquals(1, unicorn.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterDigestion(){
        Food food1 = new Food("grass");
        Food food2 = new Food("ice cream");
        unicorn.eat(food1);
        unicorn.eat(food2);
        assertEquals(2, unicorn.foodCount());
        unicorn.digest();
        assertEquals(0, unicorn.foodCount());
    }

    @Test
    public void canThrowUp(){
        Food food1 = new Food("salmon");
        Food food2 = new Food("mouse");
        unicorn.eat(food1);
        unicorn.eat(food2);
        assertEquals(2, unicorn.foodCount());
        unicorn.spendEnergy();
        assertEquals(1 ,unicorn.foodCount());
    }

    @Test
    public void canGetEnergy(){
        assertEquals(0,unicorn.foodCount());
        unicorn.getEnergy();
        assertEquals("I don't feel weel. I am without energy. Please feed me." ,unicorn.getEnergy());
    }

    @Test
    public void canSpendEnergy(){
        Food food1 = new Food("salmon");
        unicorn .eat(food1);
        unicorn .eat(food1);
        unicorn .eat(food1);
        assertEquals(3, unicorn.foodCount());
        unicorn.fly();
        unicorn.gallop();
        assertEquals(1, unicorn.foodCount());
    }
}
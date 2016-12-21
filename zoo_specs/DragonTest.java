import zoo.*;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 16/12/2016.
 */

public class DragonTest {
    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon("Camroth Protector Of The Forest",10,"dragon");
    }

    @Test
    public void hasName(){
        assertEquals("Camroth Protector Of The Forest", dragon.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(10, dragon.getAge());
    }

    @Test
    public void canFly(){
        assertEquals(dragon.fly(),"I do not like to fly in this enclosure, I want to be free!");
    }


    @Test
    public void bellyStartsEmptyTest(){
        assertEquals(0,dragon.foodCount());
    }

    @Test
    public void canEatFood(){
        Food food = new Food("salmon");
        dragon.eat(food);
        assertEquals(1, dragon.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterDigestion(){
        Food food1 = new Food("salmon");
        Food food2 = new Food("mouse");
        dragon.eat(food1);
        dragon.eat(food2);
        assertEquals(2, dragon.foodCount());
        dragon.digest();
        assertEquals(0, dragon.foodCount());
    }

    @Test
    public void canGetEnergy(){
        Food food1 = new Food("salmon");
        Food food2 = new Food("mouse");
        dragon.eat(food1);
        dragon.eat(food2);
        assertEquals(2, dragon.foodCount());
        dragon.getEnergy();
        assertEquals("I feel good" ,dragon.getEnergy());
    }

    @Test
    public void canSpendEnergy(){
        Food food1 = new Food("salmon");
        dragon.eat(food1);
        assertEquals(1, dragon.foodCount());
        dragon.fly();
        assertEquals(0, dragon.foodCount());
    }



}
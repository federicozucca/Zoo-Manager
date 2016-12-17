package zoo;
import static org.junit.Assert.*;
import org.junit.*;

/**
 * Created by user on 16/12/2016.
 */

public class MermeidTest {
    Mermeid mermeid;

    @Before
    public void before(){
        mermeid = new Mermeid("Ariel",18);
    }

    @Test
    public void hasName(){
        assertEquals("Ariel", mermeid.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(18, mermeid.getAge());
    }

    @Test
    public void canFly(){
        assertEquals(mermeid.swim(),"Where is Nemo??");
    }

    @Test
    public void bellyStartsEmptyTest(){
        assertEquals(0,mermeid.foodCount());
    }

    @Test
    public void canEatFood(){
        Food food = new Food("Sebastian");
        mermeid.eat(food);
        assertEquals(1, mermeid.foodCount());
    }

    @Test
    public void shouldEmptyBellyAfterDigestion(){
        Food food1 = new Food("Sebastian");
        Food food2 = new Food("crab");
        mermeid.eat(food1);
        mermeid.eat(food2);
        assertEquals(2, mermeid.foodCount());
        mermeid.digest();
        assertEquals(0, mermeid.foodCount());
    }

    @Test
    public void canThrowUp(){
        Food food1 = new Food("Sebastian");
        Food food2 = new Food("crab");
        mermeid.eat(food1);
        mermeid.eat(food2);
        assertEquals(2, mermeid.foodCount());
        mermeid.spendEnergy();
        assertEquals(1 ,mermeid.foodCount());
    }

    @Test
    public void canGetEnergy(){
        Food food2 = new Food("crab");
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        mermeid.eat(food2);
        assertEquals(10, mermeid.foodCount());
        mermeid.getEnergy();
        assertEquals("I am full of energy!" ,mermeid.getEnergy());
    }

    @Test
    public void canSpendEnergy(){
        Food food1 = new Food("salmon");
        mermeid.eat(food1);
        assertEquals(1, mermeid.foodCount());
        mermeid.swim();
        assertEquals(0, mermeid.foodCount());
    }
}
import zoo.*;
import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by user on 16/12/2016.
 */

public class DragonFenceEnclosureTest {
    DragonFenceEnclosure dragonFenceEnclosure;


    @Before
    public void before(){
        dragonFenceEnclosure = new DragonFenceEnclosure("Dragon");
    }

    @Test
    public void dragonCanBeEnclosedInTheDragonFenceTest(){
        Dragon dragon = new Dragon("Ada", 10);
        dragonFenceEnclosure.addAnimal(dragon);
        assertEquals(1,dragonFenceEnclosure.getSize());
    }


    @Test
    public void mermeidCanBeRemovedFromTheUnicornFenceTest(){
        Dragon dragon = new Dragon("Ada", 10);
        dragonFenceEnclosure.addAnimal(dragon);
        dragonFenceEnclosure.removeAnimal(dragon);
        assertEquals(1,dragonFenceEnclosure.getSize());
    }

}
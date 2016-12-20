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
        Dragon dragon = new Dragon("Ada", 10,"dragon");
        dragonFenceEnclosure.addAnimal(dragon);
        assertEquals(1,dragonFenceEnclosure.getSize());
    }


    @Test
    public void dragonCanBeRemovedFromTheDragonFenceTest(){
        Dragon dragon1 = new Dragon("Ralph", 10, "dragon");
        Dragon dragon2 = new Dragon("Ralph", 10,"dragon");
        dragonFenceEnclosure.addAnimal(dragon1);
        dragonFenceEnclosure.addAnimal(dragon2);
        dragonFenceEnclosure.removeAnimal(dragon1);
        assertEquals(1,dragonFenceEnclosure.getSize());
    }

}
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
        dragonFenceEnclosure = new DragonFenceEnclosure("Main Pool");
    }

    @Test
    public void mermeidsCanBeEnclosedInThePoolTest(){
        Dragon dragon = new Dragon("Ada", 10);
        dragonFenceEnclosure.addAnimal(dragon);
        assertEquals(1,dragonFenceEnclosure.getSize());
    }

}
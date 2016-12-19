import zoo.*;
import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by user on 16/12/2016.
 */

public class UnicornFenceEnclosureTest {
    UnicornFenceEnclosure unicornFenceEnclosure;


    @Before
    public void before(){
        unicornFenceEnclosure = new UnicornFenceEnclosure("Main Pool");
    }

    @Test
    public void mermeidsCanBeEnclosedInThePoolTest(){
        Unicorn unicorn = new Unicorn("Ralph", 10);
        unicornFenceEnclosure.addAnimal(unicorn);
        assertEquals(1,unicornFenceEnclosure.getSize());
    }

}
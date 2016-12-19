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
        unicornFenceEnclosure = new UnicornFenceEnclosure("unicorn");
    }

    @Test
    public void unicornCanBeEnclosedInTheUnicornFenceTest(){
        Unicorn unicorn = new Unicorn("Ralph", 10);
        unicornFenceEnclosure.addAnimal(unicorn);
        assertEquals(1,unicornFenceEnclosure.getSize());
    }

    @Test
    public void unicornCanBeRemovedFromTheUnicornFenceTest(){
        Unicorn unicorn1 = new Unicorn("Ralph", 10);
        Unicorn unicorn2 = new Unicorn("Ralph", 10);
        unicornFenceEnclosure.addAnimal(unicorn1);
        unicornFenceEnclosure.addAnimal(unicorn2);
        unicornFenceEnclosure.removeAnimal(unicorn1);
        assertEquals(1,unicornFenceEnclosure.getSize());
    }



}
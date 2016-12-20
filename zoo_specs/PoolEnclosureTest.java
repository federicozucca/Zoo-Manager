import zoo.*;
import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by user on 16/12/2016.
 */

public class PoolEnclosureTest {
    PoolEnclosure poolEnclosure;


    @Before
    public void before(){
        poolEnclosure = new PoolEnclosure("Pool");
    }

    @Test
    public void mermeidsCanBeEnclosedInThePoolTest(){
        Mermeid mermeid = new Mermeid("Ariel", 10);
        poolEnclosure.addAnimal(mermeid);
        assertEquals(1,poolEnclosure.getSize());
    }

    @Test
    public void mermeidCanBeRemovedFromTheUnicornFenceTest(){
        Mermeid mermeid = new Mermeid("Ariel", 10);
        poolEnclosure.addAnimal(mermeid);
        poolEnclosure.addAnimal(mermeid);
        poolEnclosure.removeAnimal(mermeid);
        assertEquals(1,poolEnclosure.getSize());
    }
}
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
        Mermeid mermeid = new Mermeid("Ariel", 10,"mermeid");
        poolEnclosure.addAnimal(mermeid);
        assertEquals(1,poolEnclosure.getSize());
    }

    @Test
    public void mermeidCanBeRemovedFromThePoolTest(){
        Mermeid mermeid1 = new Mermeid("Ariel", 10,"mermeid");
        Mermeid mermeid2 = new Mermeid("Ada", 10,"mermeid");
        poolEnclosure.addAnimal(mermeid1);
        poolEnclosure.addAnimal(mermeid2);
        poolEnclosure.removeAnimal(mermeid1);
        assertEquals(1,poolEnclosure.getSize());
    }


}
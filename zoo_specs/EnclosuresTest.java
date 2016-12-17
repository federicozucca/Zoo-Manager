package zoo;
import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by user on 16/12/2016.
 */

public class EnclosuresTest {
    Enclosure enclosure;

    @Before
    public void before(){
        enclosure = new Enclosure("pool");
    }

    @Test
    public void mermeidsCanBeEnclosedInThePool(){
        Mermeid mermeid = new Mermeid("Ariel", 10);
        enclosure.addAnimal(mermeid);
        assertEquals(1,enclosure.getSize());
    }

}

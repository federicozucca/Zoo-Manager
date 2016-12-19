import zoo.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 16/12/2016.
 */

public class ZooTest {
    Zoo zoo;

    @Before
    public void before() {
        zoo = new Zoo("Edinburgh Zoo");

    }
    @Test
    public void zooCanGetAName(){
        assertEquals("Edinburgh Zoo", zoo.getName());
    }

}

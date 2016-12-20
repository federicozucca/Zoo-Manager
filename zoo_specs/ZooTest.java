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

    @Test
    public void canAddAnAnimal(){
    Mermeid mermeid = new Mermeid("Ariel",19);
    zoo.addAnimaltoMysticalAnimals(mermeid);
    assertEquals(1, zoo.animalsTotalNumber());
    }

    @Test
    public void canRemoveAnAnimal(){
    Mermeid mermeid = new Mermeid("Ariel",19);
    Mermeid mermeid1 = new Mermeid("Ariel",19);
    zoo.addAnimaltoMysticalAnimals(mermeid);
    zoo.addAnimaltoMysticalAnimals(mermeid1);
    zoo.removeAnimalFromMysticalAnimals(mermeid1);
    assertEquals(1, zoo.animalsTotalNumber());
    }

    // @Test
    // public void getEnclosureByName(){
    // UnicornFenceEnclosure unicornFenceEnclosure = new UnicornFenceEnclosure("unicorn");
    // zoo.addEnclosureToZoo(unicornFenceEnclosure);
    // PoolEnclosure poolEnclosure = new PoolEnclosure("Mermeid Pool");
    // zoo.addEnclosureToZoo(poolEnclosure);
    // zoo.getEnclosureName("Mermeid Pool");
    // assertEquals(poolEnclosure, zoo.getEnclosureName());
    // }

    @Test
    public void canAddAnEnclosure(){
    PoolEnclosure poolEnclosure = new PoolEnclosure("Mermeid Pool");
    zoo.addEnclosureToZoo(poolEnclosure);
    assertEquals(1, zoo.enclosuresTotalNumber());
    }

    @Test
    public void canRemoveAnEnclosure(){
    PoolEnclosure poolEnclosure = new PoolEnclosure("Mermeid Pool");
    zoo.addEnclosureToZoo(poolEnclosure);
    assertEquals(1, zoo.enclosuresTotalNumber());
    zoo.removeEnclosureFromZoo(poolEnclosure);
    assertEquals(0, zoo.enclosuresTotalNumber());
    }

    @Test
    public void canAddAnAnimalToEnclosure(){
    PoolEnclosure poolEnclosure = new PoolEnclosure("Mermeid Pool");
    zoo.addEnclosureToZoo(poolEnclosure);
    Mermeid mermeid = new Mermeid("Ariel",19);
    zoo.addAnimaltoMysticalAnimals(mermeid);
    zoo.addAnimalToEnclosures("Mermeid Pool", mermeid);
    assertEquals(1, zoo.animalsTotalNumber());
    assertEquals(1, zoo.enclosuresTotalNumber());
    }

    @Test
    public void canRemoveAnAnimalToEnclosure(){
    PoolEnclosure poolEnclosure = new PoolEnclosure("Mermeid Pool");
    zoo.addEnclosureToZoo(poolEnclosure);
    Mermeid mermeid = new Mermeid("Ariel",19);
    zoo.addAnimaltoMysticalAnimals(mermeid);
    assertEquals(1, zoo.animalsTotalNumber());
    zoo.removeAnimalFromMysticalAnimals(mermeid);
    zoo.addAnimalToEnclosures("Mermeid Pool", mermeid);
    assertEquals(0, zoo.animalsTotalNumber());
    assertEquals(1, zoo.enclosuresTotalNumber());
    }


  }

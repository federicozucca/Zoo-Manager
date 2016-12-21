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
    Mermeid mermeid = new Mermeid("Ariel",19,"mermeid");
    zoo.addAnimaltoMysticalAnimals(mermeid);
    assertEquals(1, zoo.animalsTotalNumber());
    }

    @Test
    public void canRemoveAnAnimal(){
    Mermeid mermeid = new Mermeid("Ariel",19, "mermeid");
    Mermeid mermeid1 = new Mermeid("Ariel",19, "mermeid");
    Unicorn olo = new Unicorn("Hulk",19, "unicorn");
    zoo.addAnimaltoMysticalAnimals(mermeid);
    zoo.addAnimaltoMysticalAnimals(mermeid1);
    zoo.addAnimaltoMysticalAnimals(olo);
    zoo.removeAnimalFromMysticalAnimals(olo);
    assertEquals(2, zoo.animalsTotalNumber());
    }


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
    Mermeid mermeid = new Mermeid("Ariel",19, "mermeid");
    zoo.addAnimaltoMysticalAnimals(mermeid);
    zoo.addAnimalToEnclosures("Mermeid Pool", mermeid);
    assertEquals(1, zoo.animalsTotalNumber());
    assertEquals(1, zoo.enclosuresTotalNumber());
    }

    @Test
    public void canRemoveAnAnimalToEnclosure(){
    PoolEnclosure poolEnclosure = new PoolEnclosure("Mermeid Pool");
    zoo.addEnclosureToZoo(poolEnclosure);
    Mermeid mermeid = new Mermeid("Ariel",19, "mermeid");
    zoo.addAnimaltoMysticalAnimals(mermeid);
    assertEquals(1, zoo.animalsTotalNumber());
    zoo.removeAnimalFromMysticalAnimals(mermeid);
    zoo.addAnimalToEnclosures("Mermeid Pool", mermeid);
    assertEquals(0, zoo.animalsTotalNumber());
    assertEquals(1, zoo.enclosuresTotalNumber());
    }


  }

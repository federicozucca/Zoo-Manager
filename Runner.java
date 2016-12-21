import zoo.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("Enter zoo name: ");
    String zooName = System.console().readLine();
    Zoo zoo = new Zoo(zooName);
    Visitors visitors = new Visitors();
    System.out.println("Welcome to: " + zoo.getName());
    CommandLine commandLine = new CommandLine(zoo, visitors);

    PoolEnclosure poolEnclosure= new PoolEnclosure("Mermeid Pool");
    zoo.enclosures.add(poolEnclosure);
    DragonFenceEnclosure dragonFenceEnclosure = new DragonFenceEnclosure("Dragon Fence");
    zoo.enclosures.add(dragonFenceEnclosure);
    UnicornFenceEnclosure unicornFenceEnclosure = new UnicornFenceEnclosure("Unicorn Fence");
    zoo.enclosures.add(unicornFenceEnclosure);

    Dragon dragon = new Dragon("Camroth Protector Of The Forest", 10, "Dragon");
    zoo.mysticalAnimals.add(dragon);
    zoo.addAnimalToEnclosures("Dragon Fence", dragon);

    Mermeid mermeid = new Mermeid("Ariel",18, "Mermeid");
    zoo.mysticalAnimals.add(mermeid);
    zoo.addAnimalToEnclosures("Mermeid Pool", mermeid);

    Unicorn unicorn = new Unicorn("Ralph",10, "Unicorn");
    zoo.mysticalAnimals.add(unicorn);  
    zoo.addAnimalToEnclosures("Unicorn Fence", unicorn);


    

    commandLine.run();

  }
}

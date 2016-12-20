import zoo.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("Enter zoo name: ");
    String zooName = System.console().readLine();
    Zoo zoo = new Zoo(zooName);
    System.out.println("Welcome to: " + zoo.getName());
    CommandLine commandLine = new CommandLine(zoo);

    PoolEnclosure poolEnclosure= new PoolEnclosure("Mermeid Pool");
    zoo.enclosures.add(poolEnclosure);
    DragonFenceEnclosure dragonFenceEnclosure = new DragonFenceEnclosure("Dragon Fence");
    zoo.enclosures.add(dragonFenceEnclosure);
    UnicornFenceEnclosure unicornFenceEnclosure = new UnicornFenceEnclosure("Unicorn Fence");
    zoo.enclosures.add(unicornFenceEnclosure);
    Lake lake = new Lake("Lake");
    zoo.enclosures.add(lake);
    Dragon dragon = new Dragon("Camroth Protector Of The Forest", 10);
    zoo.mysticalAnimals.add(dragon);
    Mermeid mermeid = new Mermeid("Ariel",18);
    zoo.mysticalAnimals.add(mermeid);
    Unicorn unicorn = new Unicorn("Ralph",10);
    zoo.mysticalAnimals.add(unicorn);  
    Nessie nessie = new Nessie("Nessie", 1000);
    zoo.mysticalAnimals.add(nessie);
    

    commandLine.run();

  }
}

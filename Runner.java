import zoo.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("Enter zoo name: ");
    String zooName = System.console().readLine();
    Zoo zoo = new Zoo(zooName);
    System.out.println("Welcome to: " + zoo.getName());
    CommandLine commandLine = new CommandLine(zoo);

    // Dragon dragon = new Dragon("Camroth Protector Of The Forest", 10);
    // Mermeid mermeid = new Mermeid("Ariel",18);
    // Unicorn unicorn = new Unicorn("Ralph",10);
    // PoolEnclosure poolEnclosure= new PoolEnclosure("Mermeid Pool");
    // DragonFenceEnclosure dragonFenceEnclosure = new DragonFenceEnclosure("Dragon Fence");
    // UnicornFenceEnclosure unicornFenceEnclosure = new UnicornFenceEnclosure("Unicorn Fence");
    // Lake lake = new Lake("Lake");

    commandLine.run();

  }
}

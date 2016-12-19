import zoo.*;
import java.util.ArrayList;

public class Runner {
  public static void main(String[] args) {
    System.out.println("Enter zoo name: ");
    String zooName = System.console().readLine();
    Zoo zoo = new Zoo(zooName);
    System.out.println("Welcome to: " + zoo.getName());
    Player player = new Player(zoo);

    player.run();

  }
}

package zoo;

import java.util.ArrayList;
import java.util.Scanner;


public class Player {
  private Zoo zoo;


  public Player() {
    this.zoo = zoo;
  }

  public void activity(){
System.out.println(" What would you like to do? write 'add' to add an animal, 'rmv' to remove an animal, 'income' to see the zoo's income");
String input = System.console().readLine();
if ("add".equals(input)){addMysticalAnimal();}
}

public void addMysticalAnimal() {
  System.out.println("Press 'm' to add a Mermeid, 'd' to add a Dragon, 'u' to add an unicorn");
  String input = System.console().readLine();
  if ("m".equals(input)) {
    addMermeid();
  } else if ("d".equals(input)) {
    addDragon();
  } else if ("u".equals(input)) {
    addUnicorn();
  }
}
  public void addMermeid(){
    System.out.println("Enter Mermeid name: ");
    String mermeidName = System.console().readLine();
    System.out.println("Enter " + mermeidName +" age: ");
    String mermeidAge = System.console().readLine();
    // Mermeid mermeid = new Mermeid(mermeidName,mermeidAge);
    System.out.println("Memeid added to " + zoo.getName());


  }
  public void addUnicorn(){
    System.out.println("Enter Unicorn name: ");
    String unicornName = System.console().readLine();
    System.out.println("Enter " + unicornName +" age: ");
    String unicornAge = System.console().readLine();
    // Unicorn unicorn = new Unicorn(unicornName,unicornAge);
    System.out.println("Unicorn added to " + zoo.getName());
  }

  public void addDragon(){
    System.out.println("Enter Dragon name: ");
    String dragonName = System.console().readLine();
    System.out.println("Enter " + dragonName +" age: ");
    String age = System.console().readLine();

    int dragonAge = Integer.valueOf(age);

    Dragon dragon = new Dragon(dragonName,dragonAge);
    System.out.println("Dragon added to " + zoo.getName());

  }

public void run(){
  activity();
  
}

}



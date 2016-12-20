package zoo;

import java.util.ArrayList;
import java.util.Scanner;


public class CommandLine {
  private Zoo zoo;

  public CommandLine(Zoo zoo) {
    this.zoo = zoo;
    zoo.populateEnclosures();
    zoo.populateAnimals();
  }

  public void index(){
    System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    System.out.println(" What would you like to do? Write 'add' to add an animal, 'ShowAnim' to see all the Zoo's Animals, 'ShowEnc' to see all the Zoo's Enclosures");
    String input = System.console().readLine();
    if ("add".equals(input)){addMysticalAnimal();}
    if ("ShowEnc".equals(input)){showAllEnclosures();}
    if ("ShowAnim".equals(input)){showAllAnimals();}
    System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
  }

    public void showAllEnclosures(){
    zoo.printAllEnclosures();
    index();
  }

    public void showAllAnimals(){
    zoo.printAllAnimals();
    index();
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
    String number = System.console().readLine();
    int mermeidAge = Integer.parseInt(number);
    Mermeid mermeid = new Mermeid(mermeidName,mermeidAge);
    zoo.addAnimaltoMysticalAnimals(mermeid);
    zoo.addAnimalToEnclosures("Mermeid Pool", mermeid);
    System.out.println("Mermeid added to: " + zoo.getName());

    index();
  }
  
  public void addUnicorn(){
    System.out.println("Enter Unicorn name: ");
    String unicornName = System.console().readLine();
    System.out.println("Enter " + unicornName +" age: ");
    String number = System.console().readLine();
    int unicornAge = Integer.parseInt(number);
    Unicorn unicorn = new Unicorn(unicornName,unicornAge);
    zoo.addAnimaltoMysticalAnimals(unicorn);
    zoo.addAnimalToEnclosures("Unicorn Fence", unicorn);
    System.out.println("Unicorn added to: " + zoo.getName());

    index();
}

public void addDragon(){
  System.out.println("Enter Dragon name: ");
  String dragonName = System.console().readLine();
  System.out.println("Enter " + dragonName +" age: ");
  String number = System.console().readLine();
  int dragonAge = Integer.parseInt(number);
  Dragon dragon = new Dragon(dragonName,dragonAge);
  zoo.addAnimaltoMysticalAnimals(dragon);
  zoo.addAnimalToEnclosures("Dragon Fence", dragon);
  System.out.println("Dragon added to: " + zoo.getName());

  index();
}

  public void run(){
    index();

  }

}



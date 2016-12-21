package zoo;

import java.util.ArrayList;
import java.util.Scanner;


public class CommandLine {
  private Zoo zoo;

  public CommandLine(Zoo zoo) {
    this.zoo = zoo;
  }

  public String index(){
    System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    System.out.println(" What would you like to do? Write:\n'i' to add an animal, \n'a' to see all the Zoo's Animals, \n'e' to see all the Zoo's Enclosures, \n 'f' to feed all the animals");

    String input = System.console().readLine();
    switch (input) {
      case"i":
      addMysticalAnimal();
      case"a":
      showAllEnclosures();
      case"e":
      showAllAnimals();
      case"f":
      feedAnimal();
      System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    }
    return "Error";    
  }

    public void showAllEnclosures(){
    zoo.getEnclosuresDetails();
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
    Mermeid mermeid = new Mermeid(mermeidName,mermeidAge,"Mermeid");
    zoo.addAnimaltoMysticalAnimals(mermeid);
    zoo.addAnimalToEnclosures("Mermeid Pool", mermeid);
    System.out.println("Mermeid "+ mermeidName + "added to: " + zoo.getName());

    index();
  }
  
  public void addUnicorn(){
    System.out.println("Enter Unicorn name: ");
    String unicornName = System.console().readLine();
    System.out.println("Enter " + unicornName +" age: ");
    String number = System.console().readLine();
    int unicornAge = Integer.parseInt(number);
    Unicorn unicorn = new Unicorn(unicornName,unicornAge,"Unicorn");
    zoo.addAnimaltoMysticalAnimals(unicorn);
    zoo.addAnimalToEnclosures("Unicorn Fence", unicorn);
    System.out.println("Unicorn "+ unicornName + " added to: " + zoo.getName());

    index();
}

public void addDragon(){
  System.out.println("Enter Dragon name: ");
  String dragonName = System.console().readLine();
  System.out.println("Enter " + dragonName +" age: ");
  String number = System.console().readLine();
  int dragonAge = Integer.parseInt(number);
  Dragon dragon = new Dragon(dragonName,dragonAge,"Dragon");
  zoo.addAnimaltoMysticalAnimals(dragon);
  zoo.addAnimalToEnclosures("Dragon Fence", dragon);
  System.out.println("Dragon "+ dragonName + "added to: " + zoo.getName());
    index();
  }

  public void feedAnimal(){
  zoo.feedAnimal();
  index();
  }





  public void run(){
    index();

  }

}



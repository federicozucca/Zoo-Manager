package zoo;

import java.util.ArrayList;
import java.util.Scanner;


public class CommandLine {
  private Zoo zoo;
  private Visitors visitors;

  public CommandLine(Zoo zoo, Visitors visitors) {
    this.zoo = zoo;
    this.visitors = visitors;
  }

  public String index(){
    System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
    System.out.println(" What would you like to do?\n'i' to add an animal,\n'a' to see all the Zoo's Animals,\n'e' to see all the Zoo's Enclosures,\n'f' to feed all the animals,\n'v' to add an Adult visitor,\n'd' to add a visitor with a discount (Students or Under 16),\n'p' to see the Income");

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
      case"v":
      addAdultVisitor();
      case"d":
      addDiscountVisitor();
      case"p":
      showIncome();
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

  public void addAdultVisitor(){
    visitors.addAdultVisitors();
    System.out.println("Visitor Added, at the moment you have a total of "+ visitors.getNumberOfAdultVisitors() + " adults visitors in the Park.");


    index();
  }

  public void addDiscountVisitor(){
    visitors.addDiscountVisitors();
    System.out.println("Visitor Added, at the moment you have "+ visitors.getNumberOfDiscountVisitors() + " visitors with a discount and a total of " + visitors.getTotalNumberOfVisitors() + " visitors in the Park.");


    index();
  }

  public void showIncome() {
    System.out.println("At the moment you have a total of "+ visitors.getTotalNumberOfVisitors() + " visitors in the Park ("+ visitors.getNumberOfAdultVisitors() +" Adults tickets and " + visitors.getNumberOfDiscountVisitors() + " Discount tickets ). The amount of the tickets's income is of: " + visitors.incomeSellingTickets()+ ".00 £" );
  index();
  }


  public void run(){
    index();

  }

}



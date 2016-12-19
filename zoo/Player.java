package zoo;

import java.util.ArrayList;
import java.util.Scanner;


public class Player {
  private Zoo zoo;
  private PoolEnclosure poolEnclosure;


  public Player(Zoo zoo) {
    this.zoo = zoo;
  }

  public void activity(){
    System.out.println(" What would you like to do? write 'add' to add an animal, 'rmv' to remove an animal, 'income' to see the zoo's income");
    String input = System.console().readLine();
    if ("add".equals(input)){addMysticalAnimal();}
    if ("rmv".equals(input)){removeMysticalAnimal();}
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
    if (poolEnclosure.getSize() ==0){
      PoolEnclosure poolEnclosure = new PoolEnclosure("Main Pool");
      poolEnclosure.addAnimal(mermeid);
    }
    else { poolEnclosure.addAnimal(mermeid);

    }
    System.out.println("adding: " + mermeidName +"(age: "+ mermeidAge + ") to the enclosure.");
    System.out.println(mermeidName +"(age: "+ mermeidAge+") the mermeid added to " + zoo.getName()+ " and enclosed in the Main Pool.");

  }

  public void addUnicorn(){
    System.out.println("Enter Unicorn name: ");
    String unicornName = System.console().readLine();
    System.out.println("Enter " + unicornName +" age: ");
    String number = System.console().readLine();
    int unicornAge = Integer.parseInt(number);
    Unicorn unicorn = new Unicorn(unicornName,unicornAge);
    System.out.println(unicornName +"(age: "+ unicornAge+") the unicorn added to " + zoo.getName());
  }

  public void addDragon(){
    System.out.println("Enter Dragon name: ");
    String dragonName = System.console().readLine();
    System.out.println("Enter " + dragonName +" age: ");
    String number = System.console().readLine();
    int dragonAge = Integer.parseInt(number);
    Dragon dragon = new Dragon(dragonName,dragonAge);
    System.out.println(dragonName  +"(age: "+ dragonAge+") the dragon added to " + zoo.getName());

  }

  public void removeMysticalAnimal() {
    System.out.println("Press 'm' to remove a Mermeid, 'd' to remove a Dragon, 'u' to remove an unicorn");
    String input = System.console().readLine();
    if ("m".equals(input)) {
      removeMermeid();
    } 
      // else if ("d".equals(input)) {
    //   removeDragon();
    // }
     // else if ("u".equals(input)) {
    //   removeUnicorn();
    // }
  }

  public void removeMermeid(){
    System.out.println("In the zoo are present this Memeids: ");
    // System.out.println(zoo.enclosures.showAnimals());
    // String mermeidName = System.console().readLine();
    // System.out.println("Enter " + mermeidName +" age: ");
// //     // String mermeidAge = System.console().readLine();
// //     // // Mermeid mermeid = new Mermeid(mermeidName,mermeidAge);
// //     // System.out.println("Memeid added to " + zoo.getName());
  }



  public void run(){
    activity();
    
  }

}



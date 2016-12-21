package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public class Zoo {

    private String name;
    public ArrayList<Enclosure> enclosures;
    public ArrayList<MysticalAnimal> mysticalAnimals;


    public Zoo(String name) {
        this.name = name;
        this.enclosures = new ArrayList<Enclosure>();
        this.mysticalAnimals = new ArrayList<MysticalAnimal>();
    }

    public String getName(){
        return this.name;
    }

    public int enclosuresTotalNumber(){
        return enclosures.size();
    }

    public int animalsTotalNumber(){
        return mysticalAnimals.size();

    }

    public void printAllEnclosures() {
        for (Enclosure enclosure : enclosures)
            System.out.println(enclosure.getName());
    }

    public void printAllAnimals() {
        for (MysticalAnimal mysticalAnimal : mysticalAnimals)
            System.out.println(mysticalAnimal.getName() + "\nAge: " +mysticalAnimal.getAge()+ "\nType: " + mysticalAnimal.getType()  + "\nStatus: " + mysticalAnimal.getEnergy() + "\n-_-_-_-_-_-_-_-_-_-_-_-_" );
    }


    public Enclosure getEnclosureName(String name){
        for( Enclosure enclosure : enclosures){
            if (enclosure.getName() == name){
                return enclosure;
            }
        }
        return null;
    }

public void addEnclosureToZoo(Enclosure enclosure){
        enclosures.add(enclosure);
}

public void removeEnclosureFromZoo(Enclosure enclosure){
        enclosures.remove(enclosure);
}

public void addAnimaltoMysticalAnimals(MysticalAnimal animal){
    mysticalAnimals.add(animal);
}

public void removeAnimalFromMysticalAnimals(MysticalAnimal animal){
    mysticalAnimals.remove(animal);
}

public void addAnimalToEnclosures(String name, Mermeid mermeid){
    PoolEnclosure enclosure = (PoolEnclosure)getEnclosureName(name);
    enclosure.addAnimal(mermeid);
    }

public void addAnimalToEnclosures(String name, Unicorn unicorn){
    UnicornFenceEnclosure enclosure = (UnicornFenceEnclosure )getEnclosureName(name);
    enclosure.addAnimal(unicorn);
}

public void addAnimalToEnclosures(String name, Dragon dragon){
    DragonFenceEnclosure enclosure = (DragonFenceEnclosure)getEnclosureName(name);
    enclosure.addAnimal(dragon);
}

public void removeAnimalsFromEnclosures(String name, Mermeid mermeid){
    PoolEnclosure enclosure = (PoolEnclosure)getEnclosureName(name);
    enclosure.removeAnimal(mermeid);
    }

public void removeAnimalsFromEnclosures(String name, Unicorn unicorn){
    UnicornFenceEnclosure enclosure = (UnicornFenceEnclosure )getEnclosureName(name);
    enclosure.removeAnimal(unicorn);
}


public void removeAnimalsFromEnclosures(String name, Dragon dragon){
    DragonFenceEnclosure enclosure = (DragonFenceEnclosure)getEnclosureName(name);
    enclosure.removeAnimal(dragon);
}

public void getEnclosuresDetails() {
    for (Enclosure enclosure : enclosures) {
        System.out.println("\nEnclosure Name: " + enclosure.getName() + "\nNumber of MysticalAnimal " + enclosure.getSize() + "\n============================");
          }
    }

    public void feedAnimal(){
        Food food = new Food("salmon");
        System.out.println("Which animal would you like to feed?");
        String input = System.console().readLine();
            for (MysticalAnimal mysticalAnimal : mysticalAnimals)
                if (input.equals(mysticalAnimal.getName())){
                    mysticalAnimal.eat(food);
                    System.out.println(mysticalAnimal.getEnergy());
                }

        }

    public void removeAnimal(){
        System.out.println("Which animal would you like to remove?");
        String input = System.console().readLine();

        for (MysticalAnimal mysticalAnimal : mysticalAnimals)
            if (input.equals(mysticalAnimal.getName())){
                removeAnimalFromMysticalAnimals(mysticalAnimal);
        }

    }

}

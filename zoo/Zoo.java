package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public class Zoo {

    private String name;
    private ArrayList<Enclosure> enclosures;
    private ArrayList<MysticalAnimal> mysticalAnimals;


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

    public void populateEnclosures(){
        enclosures.add(new PoolEnclosure("Mermeid Pool"));
        enclosures.add(new DragonFenceEnclosure("Dragon Fence"));
        enclosures.add(new UnicornFenceEnclosure("Unicorn Fence"));
        enclosures.add(new Lake("Lake"));
    }

    public void printAllEnclosures() {
        for (Enclosure enclosure : enclosures)
            System.out.println(enclosure.getName());
    }

    public void populateAnimals(){
        mysticalAnimals.add(new Dragon("Camroth Protector Of The Forest",10));
        mysticalAnimals.add(new Unicorn("Ralph",10));
        mysticalAnimals.add(new Mermeid("Ariel",1));
    }

    public void printAllAnimals() {
        for (MysticalAnimal mysticalAnimal : mysticalAnimals)
            System.out.println(mysticalAnimal.getName() + " Age: " +mysticalAnimal.getAge() + " Status: " + mysticalAnimal.getEnergy() );
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


}

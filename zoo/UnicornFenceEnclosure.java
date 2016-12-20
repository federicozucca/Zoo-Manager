package zoo;
import java.util.ArrayList;

public class UnicornFenceEnclosure extends Enclosure{

ArrayList<Unicorn> mysticalAnimals;
 
  public UnicornFenceEnclosure(String name){
    super(name);
    this.mysticalAnimals = new ArrayList<Unicorn>();

  }

  public void addAnimal(Unicorn unicorn){
      mysticalAnimals.add(unicorn);
  }

  public void removeAnimal(Unicorn unicorn){
      mysticalAnimals.remove(unicorn);
  }


  public int getSize(){
      return mysticalAnimals.size();
  }

}
package zoo;
import java.util.ArrayList;

public class DragonFenceEnclosure extends Enclosure{

ArrayList<Dragon> mysticalAnimals;
 
  public DragonFenceEnclosure(String name){
    super(name);
    this.mysticalAnimals = new ArrayList<Dragon>();

  }

  public void addAnimal(Dragon dragon){
      mysticalAnimals.add(dragon);
  }

  public int getSize(){
      return mysticalAnimals.size();
  }

  public void removeAnimal(Dragon dragon){
      mysticalAnimals.remove(dragon);
  }

}
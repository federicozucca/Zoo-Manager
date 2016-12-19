package zoo;
import java.util.ArrayList;

public class Lake extends Enclosure {

ArrayList<LochNess> mysticalAnimals;
 
  public Lake(String name){
    super(name);
    this.mysticalAnimals = new ArrayList<LochNess>();
  }

  public void addAnimal(LochNess lochness){
      mysticalAnimals.add(lochness);
  }

  public int getSize(){
      return mysticalAnimals.size();
  }


  public void removeAnimal(LochNess lochness){
      animals.remove(lochness);
  }

  
}
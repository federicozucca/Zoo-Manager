package zoo;
import java.util.ArrayList;

public class PoolEnclosure extends Enclosure {

ArrayList<Mermeid> mysticalAnimals;
 
  public PoolEnclosure(String name){
    super(name);
    this.mysticalAnimals = new ArrayList<Mermeid>();
  }

  public void addAnimal(Mermeid mermeid){
      mysticalAnimals.add(mermeid);
  }

  public int getSize(){
      return mysticalAnimals.size();
  }

  public void removeAnimal(Mermeid mermeid){
      mysticalAnimals.remove(mermeid);
  }



}
package zoo;
import java.util.ArrayList;

public class MainPoolEnclosure extends Enclosure{

ArrayList<Mermeid> mysticalAnimals;
 
  public MainPoolEnclosure(String type){
    super(type);
    this.mysticalAnimals = new ArrayList<Mermeid>();

  }

  public void addAnimal(Mermeid mermeid){
      mysticalAnimals.add(mermeid);
  }

  public int getSize(){
      return mysticalAnimals.size();
  }

}
package zoo;
import java.util.ArrayList;

public class Lake extends Enclosure {

ArrayList<Nessie> mysticalAnimals;
 
  public Lake(String name){
    super(name);
    this.mysticalAnimals = new ArrayList<Nessie>();
  }

  public void addAnimal(Nessie nessie){
      mysticalAnimals.add(nessie);
  }

  public int getSize(){
      return mysticalAnimals.size();
  }


  public void removeAnimal(Nessie nessie){
      mysticalAnimals.remove(nessie);
  }

  
}
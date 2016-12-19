package zoo;
import java.util.ArrayList;

public class DragonFenceEnclosure extends Enclosure{

ArrayList<Dragon> animals;
 
  public DragonFenceEnclosure(String type){
    super(type);
    this.animals = new ArrayList<Dragon>();

  }

  public void addAnimal(Dragon dragon){
      animals.add(dragon);
  }

  public int getSize(){
      return animals.size();
  }

}
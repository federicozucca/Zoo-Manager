package zoo;
import java.util.ArrayList;

public class UnicornFenceEnclosure extends Enclosure{

ArrayList<Unicorn> animals;
 
  public UnicornFenceEnclosure(String type){
    super(type);
    this.animals = new ArrayList<Unicorn>();

  }

  public void addAnimal(Unicorn unicorn){
      animals.add(unicorn);
  }

  public int getSize(){
      return animals.size();
  }

}
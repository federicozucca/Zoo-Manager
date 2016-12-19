package zoo;
import java.util.ArrayList;

public class UnicornFenceEnclosure extends Enclosure{

ArrayList<Unicorn> animals;
 
  public UnicornFenceEnclosure(String name){
    super(name);
    this.animals = new ArrayList<Unicorn>();

  }

  public void addAnimal(Unicorn unicorn){
      animals.add(unicorn);
  }

  public void removeAnimal(Unicorn unicorn){
      animals.remove(unicorn);
  }


  public int getSize(){
      return animals.size();
  }

}
package zoo;

/**
 * Created by user on 16/12/2016.
 */

public class Mermeid extends MysticalAnimal implements Swimable {

    public Mermeid(String name, int age, String type){
        super(name,age,type);
    }

    public String swim(){
        spendEnergy();
        return "Where is Nemo??";
    }



}
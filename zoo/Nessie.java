package zoo;

/**
 * Created by user on 16/12/2016.
 */

public class Nessie extends MysticalAnimal implements Swimable {

    public Nessie(String name, int age){
        super(name,age);
    }

    public String swim(){
        spendEnergy();
        return "Aye! I am swimming..";
    }

    

}
package zoo;

/**
 * Created by user on 16/12/2016.
 */

public class LochNess extends MysticalAnimal implements Swimable {

    public LochNess(String name, int age){
        super(name,age);
    }

    public String swim(){
        spendEnergy();
        return "Aye! I am swimming..";
    }

    

}
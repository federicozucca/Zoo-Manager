package zoo;

/**
 * Created by user on 16/12/2016.
 */

public class Dragon extends MysticalAnimal implements Flyable {

    public Dragon(String name, int age, String type){
        super(name,age, type);
    }

    public String fly(){
        spendEnergy();
        return "I do not like to fly in this enclosure, I want to be free!";
    }
}
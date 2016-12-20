package zoo;

/**
 * Created by user on 16/12/2016.
 */

public class Unicorn extends MysticalAnimal implements Flyable, Gallopable {

    public Unicorn(String name, int age, String type){
        super(name,age,type);

    }

    public String fly(){
        spendEnergy();
        return "I like to fly with my friends :D";
    }

    public String gallop(){
        spendEnergy();
        return "clop, clop";
    }

}

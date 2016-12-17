package zoo;

/**
 * Created by user on 16/12/2016.
 */

public class Mermeid extends MysthicalAnimal implements Swimable {

    public Mermeid(String name, int age){
        super(name,age);
    }

    public String swim(){
        spendEnergy();
        return "Where is Nemo??";
    }

}
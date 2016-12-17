package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public class Enclosure {

    private String type;
    private ArrayList<MysthicalAnimal> animals;

    public Enclosure(String type){
        this.type = type;
        this.animals = new ArrayList<MysthicalAnimal>();
    }

    public void addAnimal(MysthicalAnimal mysthicalAnimal){
        animals.add(mysthicalAnimal);
    }

    public int getSize(){
        return animals.size();
    }


}
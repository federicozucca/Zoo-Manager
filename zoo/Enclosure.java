package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public abstract class Enclosure {

    private String name;

    public Enclosure(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract int getSize();


}


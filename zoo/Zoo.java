package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public class Zoo {

    private String name;
    private ArrayList<Enclosure> enclosures;


    public Zoo(String name) {
        this.name = name;
        enclosures = new ArrayList<Enclosure>();

        }

    public String getName(){
        return this.name;
    }

    public int enclosuresTotalNumber(){
        return enclosures.size();
    }

}

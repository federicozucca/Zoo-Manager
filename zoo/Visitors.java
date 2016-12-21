package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public class Visitors {

    private int numberOfVisitors;
    private int ticketsPrice;




    public Visitors() {
        this.numberOfVisitors = 0;
        this.ticketsPrice = 10;
    }

    public int getNumberOfVisitors(){
        return this.numberOfVisitors;
    }

    public int addVisitors(){
        return this.numberOfVisitors ++;
    }

}
package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public class Visitors {

    private int numberOfVisitors;
    private int ticketsPrice;
    private int income;




    public Visitors() {
        this.numberOfVisitors = numberOfVisitors;
        this.ticketsPrice = ticketsPrice;
        this.income = income;
    }

    public int getNumberOfVisitors(){
        return this.numberOfVisitors;
    }

    public int addVisitors(){
        return this.numberOfVisitors ++;
    }

    public int incomeSellingTickets(){
        ticketsPrice=10;
        income = numberOfVisitors*ticketsPrice;
        return income;
    }

}
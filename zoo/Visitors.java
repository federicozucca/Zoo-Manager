package zoo;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */

public class Visitors {

    private int numberOfAdultVisitors;
    private int numberOfDiscountVisitors;
    private int ticketsPrice;
    private int income;




    public Visitors() {
        this.numberOfAdultVisitors = numberOfAdultVisitors;
        this.numberOfDiscountVisitors = numberOfAdultVisitors;
        this.ticketsPrice = ticketsPrice;
        this.income = income;
    }

    public int getNumberOfAdultVisitors(){
        return this.numberOfAdultVisitors;
    }

    public int getNumberOfDiscountVisitors(){
        return this.numberOfDiscountVisitors;
    }

   public int getTotalNumberOfVisitors(){
    int totalVisitors = numberOfAdultVisitors+numberOfDiscountVisitors;
       return totalVisitors;
   } 

    public int addAdultVisitors(){
        return this.numberOfAdultVisitors ++;
    }

    public int addDiscountVisitors(){
        return this.numberOfDiscountVisitors ++;
    }

    public int incomeSellingTickets(){
        int adultTicketsPrice=10;
        int discountTicketsPrice=5;
        int incomeAdultTickets = numberOfAdultVisitors*adultTicketsPrice;
        int incomeDiscountTickets = numberOfDiscountVisitors*discountTicketsPrice;
        income = incomeDiscountTickets + incomeAdultTickets;
        return income;
    }

}
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
    private int outcome;




    public Visitors() {
        this.numberOfAdultVisitors = numberOfAdultVisitors;
        this.numberOfDiscountVisitors = numberOfAdultVisitors;
        this.ticketsPrice = ticketsPrice;
        this.income = income;
        this.outcome = outcome;
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

    public int dailyOutcome(){
        int feedAnimals=5;
        int cleanEnclosures=10;
        int cleanPublicAreas=5;
        int employers=100;
        outcome = feedAnimals+cleanEnclosures+cleanPublicAreas+employers;
        return outcome;
    }

    public int profit(){
        int profit = income - outcome;
        return profit;
    }



}
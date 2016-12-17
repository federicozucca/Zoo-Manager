package zoo;
import java.util.*;

/**
 * Created by user on 16/12/2016.
 */

public abstract class MysthicalAnimal {

    private String name;
    private int age;
    private ArrayList<Food> belly;
    private String energyLevel;

    public MysthicalAnimal(String name, int age){
        this.belly = new ArrayList<Food>();
        this.name = name;
        this.age = age;
        this.energyLevel = "I am full of energy!";

    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int foodCount(){
        return belly.size();
    }

    public void eat(Food food){
        belly.add(food);
    }

    public void digest(){
        belly.clear();
    }

    public Food spendEnergy(){
        if(foodCount() > 0) {
            return belly.remove(0);
        }
            return null;
        }

    public String getEnergy(){
        if(foodCount() >= 10) {
            return "I am full of energy!";}
            else if(foodCount()<10 &&foodCount()>=5){
            return "I feel good";
        }
        else if(foodCount()<5 &&foodCount()>0){
            return "I am getting tired, I need to eat";
        }

        else if(foodCount()==0){
            return "I don't feel weel. I am without energy. Please feed me.";
        }
        return null;
    }


    }
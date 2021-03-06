package zoo;
import java.util.*;

/**
 * Created by user on 16/12/2016.
 */

public abstract class MysticalAnimal {

    private String name;
    private int age;
    private ArrayList<Food> belly;
    private String energyLevel;
    public String type;

    public MysticalAnimal(String name, int age, String type){
        this.belly = new ArrayList<Food>();
        this.name = name;
        this.age = age;
        this.energyLevel = "I am full of energy!";
        this.type = type;
    }


    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getType(){
        return this.type;
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
        if(foodCount() > 2) {
            return "I am full of energy!";}
            else if(foodCount()==2){
            return "I feel good";
        }
        else if(foodCount()==1){
            return "I am getting tired, I need to eat";
        }

        else if(foodCount()==0){
            return "I don't feel well. I am without energy. Please feed me.";
        }
        return null;
    }

    


    
} 
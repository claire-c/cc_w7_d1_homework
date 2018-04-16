package Attractions;

import Interfaces.IRestrictable;
import Visitors.Visitor;

public class Playground extends Attraction implements IRestrictable{

    private String name;
    private int funRating;

    public Playground(String name, int funRating){
        super(name, funRating);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 15){
            return true;
        }else{
            return false;
        }
    }

}

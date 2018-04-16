package Attractions;

import Interfaces.IChargeable;
import Visitors.Visitor;

public class Dodgems extends Attraction implements IChargeable{

    private String name;
    private int funRating;
    private double price;

    public Dodgems(String name, int funRating, double price){
        super(name, funRating);
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public double priceFor(Visitor visitor){
         double cost;
        if(visitor.getAge() < 12){
            cost = (price/2);
        }else{
            cost = price;
        }
        return cost;
    }

}

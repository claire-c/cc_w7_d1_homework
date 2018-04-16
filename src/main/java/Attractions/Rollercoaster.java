package Attractions;

import Interfaces.IChargeable;
import Interfaces.IRestrictable;
import Visitors.Visitor;

public class Rollercoaster extends Attraction implements IChargeable, IRestrictable{

    private String name;
    private int funRating;
    private double price;

    public Rollercoaster(String name, int funRating, double price){
        super(name, funRating);
        this.price = price;
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


    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() <= 12) {
            return false;
        } else {
            if (visitor.getHeight() <= 145) {
                return false;
            } else {
                return true;
            }

        }
    }







}

package Stalls;

import Interfaces.IRestrictable;
import Visitors.Visitor;

public class CancerStickStall extends Stall implements IRestrictable {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int funRating;
    private double price;

    public CancerStickStall(String name, String ownerName, int parkingSpot, int funRating, double price){
        super(name, ownerName, parkingSpot, funRating, price);
    }

    public boolean isAllowedTo(Visitor visitor){
        if(visitor.getAge() < 18){
            return false;
        }else{
            return true;
        }
    }



}

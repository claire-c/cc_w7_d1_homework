package Stalls;

import Interfaces.IChargeable;
import Interfaces.IEnjoyable;
import Visitors.Visitor;

public abstract class Stall implements IEnjoyable, IChargeable {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int funRating;
    private double price;

    public Stall(String name, String ownerName, int parkingSpot, int funRating, double price){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.funRating = funRating;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public String getOwnerName(){
        return this.ownerName;
    }

    public int getParkingSpot(){
        return this.parkingSpot;
    }

    public int getFunRating(){
        return this.funRating;
    }

    public double priceFor(Visitor visitor){
        return this.price;
    }



}

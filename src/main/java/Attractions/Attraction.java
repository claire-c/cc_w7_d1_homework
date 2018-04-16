package Attractions;

import Interfaces.IEnjoyable;

public abstract class Attraction implements IEnjoyable {

    private String name;
    private int funRating;

    public Attraction(String name, int funRating) {
        this.name = name;
        this.funRating = funRating;
    }


}
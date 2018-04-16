package Interfaces;

import Visitors.Visitor;

public interface IChargeable {

    public double priceFor(Visitor visitor);

}

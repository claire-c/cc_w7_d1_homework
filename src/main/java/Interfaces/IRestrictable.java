package Interfaces;

import Visitors.Visitor;

public interface IRestrictable {

    public boolean isAllowedTo(Visitor visitor);

}

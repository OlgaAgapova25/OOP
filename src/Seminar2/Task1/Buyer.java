package Seminar2.Task1;

public abstract class Buyer implements BuyerBehaviour {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;
    abstract String getName();
}

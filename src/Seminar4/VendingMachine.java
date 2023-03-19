package Seminar4;

public interface VendingMachine {
    Product getProduct(String name) throws IllegalStateException;
}
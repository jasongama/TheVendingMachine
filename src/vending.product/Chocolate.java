package vending.product;

public class Chocolate extends Product {
    private int getAddChocolateCount = 0;

    @Override
    public String description() {
        return "This are chocolates";
    }

    public void setGetStock(Chocolate chocolate) {
        this.getAddChocolateCount+=1;
    }

    public int getChocolate() {
        return getAddChocolateCount;
    }
}

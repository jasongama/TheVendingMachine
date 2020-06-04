package vending.product;

public class Juice extends Product {
    private int getAddJuiceCount= 0;

    @Override
    public String description() {
        return "This is a Juice";
    }

    public void setGetStock(Juice juice) {

        this.getAddJuiceCount+=1;
    }

    public int getJuiceStock() {
        return getAddJuiceCount;
    }
}

package vending.product;

public class SoftDrink extends Product {
    private int getAddSoftDrinkStockCount = 0;

    @Override
    public String description() {
        return "This are SoftDrinks";
    }

    public void setGetStock(SoftDrink softdrink) {
       this.getAddSoftDrinkStockCount +=1;

    }

    public int getSoftDrink() {
        return getAddSoftDrinkStockCount;
    }
}

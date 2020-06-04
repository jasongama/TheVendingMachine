package vending.product;

public class SaltySnack extends Product {
    private int getAddSaltySnackCount = 0;

    @Override
    public String description() {
        return "This are SaltySnacks";
    }

    public void setGetStock(SaltySnack saltySnack) {

       this.getAddSaltySnackCount+=1;
    }

    public int getSaltySnack() {
        return getAddSaltySnackCount;
    }

}

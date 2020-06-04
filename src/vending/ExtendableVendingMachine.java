package vending;

import vending.product.*;

public class ExtendableVendingMachine {
    private int softDrink = 0;
    private int chocolate = 0;
    private int saltySnack = 0;
    private int juice = 0;

    public ExtendableVendingMachine(int saltySnack, int chocolate, int softDrink, int juice) {
        this.chocolate = saltySnack;
        this.saltySnack = chocolate;
        this.softDrink = softDrink;
        this.juice = juice;
    }


    public void buy(Product product) {
        //The java instanceof operator is used to test whether the object is an instance of the specified type
        // (class or subclass or interface).
        if (product instanceof SoftDrink && softDrink > 0) {
            softDrink -= 1;
        } else if (product instanceof SaltySnack && saltySnack > 0) {
            saltySnack -= 1;
        } else if (product instanceof Chocolate && chocolate > 0) {
            chocolate -= 1;
        } else if (product instanceof Juice) {
            juice -= 1;
        }
    }


    public void addStock(Product product) {
        if (product instanceof SaltySnack) {
            saltySnack += 1;
        } else if (product instanceof SoftDrink) {
            softDrink += 1;
        } else if (product instanceof Chocolate) {
            chocolate += 1;
        } else if (product instanceof Juice) {
            juice += 1;
        }

    }

    public int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return softDrink;
        } else if (product instanceof Chocolate) {
            return chocolate;
        } else if (product instanceof SaltySnack) {
            return saltySnack;
        } else if (product instanceof Juice) {
            return juice;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {
        ExtendableVendingMachine addProduct = new ExtendableVendingMachine(3, 0, 0, 0);
        System.out.println("You haven't selected a product " + addProduct.getStock(new Product()));

        System.out.println("\nThank you for purchasing SaltySnack");
        ExtendableVendingMachine products = new ExtendableVendingMachine(3, 0, 0, 0);
        products.addStock(new SaltySnack());
        products.addStock(new SaltySnack());
        products.addStock(new SaltySnack());
        products.addStock(new SaltySnack());
        products.buy(new SaltySnack());

        System.out.println("You have purchase " + products.getStock(new SaltySnack()) + " Salty Snacks");

        System.out.println("\nThank you for   purchasing SoftDrinks");
        ExtendableVendingMachine product = new ExtendableVendingMachine(3, 0, 5, 0);
        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());
        product.addStock(new SoftDrink());
        product.buy(new SoftDrink());

        System.out.println("You have purchase " + product.getStock(new SoftDrink()) + " SoftDrinks");

        System.out.println("\nThank you for purchasing Chocolates");
        ExtendableVendingMachine productStock = new ExtendableVendingMachine(3, 6, 5, 0);
        productStock.addStock(new Chocolate());
        productStock.addStock(new Chocolate());
        productStock.addStock(new Chocolate());
        productStock.addStock(new Chocolate());
        productStock.buy(new Chocolate());

        System.out.println("You have purchase " + productStock.getStock(new Chocolate()) + " Chocolates");

        System.out.println("\nThank you for purchasing Juices");
        ExtendableVendingMachine productStocks = new ExtendableVendingMachine(3, 6, 5, 4);
        productStocks.addStock(new Juice());
        productStocks.addStock(new Juice());
        productStocks.addStock(new Juice());
        productStocks.addStock(new Juice());
        productStocks.buy(new Juice());

        System.out.println("You have purchase " + productStocks.getStock(new Juice()) + " Juices");

        System.out.println("\nThank you for purchasing");

        }

}

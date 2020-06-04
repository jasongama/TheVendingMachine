package vending;

import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

public class ExtendableVendingMachine {
    public static int softDrink = 0;
    public static int chocolate = 0;
    public static int saltySnack = 0;

    public ExtendableVendingMachine(int saltySnack, int chocolate, int softDrink) {
        this.chocolate = saltySnack;
        this.saltySnack = chocolate;
        this.softDrink = softDrink;

    }

    public static void buy(Product product) {
        //The java instanceof operator is used to test whether the object is an instance of the specified type
        // (class or subclass or interface).
        if (product instanceof SoftDrink && softDrink > 0) {
            softDrink -= 1;
        } else if (product instanceof SaltySnack && saltySnack > 0) {
            saltySnack -= 1;
        } else if (product instanceof Chocolate && chocolate > 0) {
            chocolate -= 1;
        }
    }

    public static void addStock(Product product) {
        if (product instanceof SaltySnack) {
            saltySnack += 1;
        } else if (product instanceof SoftDrink) {
            softDrink += 1;

        } else if (product instanceof Chocolate) {

            chocolate += 1;
        }

    }

    public static int getStock(Product product) {
        if (product instanceof SoftDrink) {
            return softDrink;
        } else if (product instanceof Chocolate) {
            return chocolate;
        } else if (product instanceof SaltySnack) {
            return saltySnack;
        } else {
            return 0;
        }
    }


    public static void main(String[] args) {

        System.out.println("You haven't selected a product " + getStock(new Product()));

        System.out.println("\nThank you for purchasing SaltySnack");
        addStock(new SaltySnack());
        addStock(new SaltySnack());
        addStock(new SaltySnack());
        buy(new SaltySnack());

        System.out.println("You have purchase " + getStock(new SaltySnack()) + " Salty Snacks");

        System.out.println("\nThank you for purchasing SoftDrinks");
        addStock(new SoftDrink());
        addStock(new SoftDrink());
        addStock(new SoftDrink());
        addStock(new SoftDrink());
        buy(new SoftDrink());

        System.out.println("You have purchase " + getStock(new SoftDrink()) + " SoftDrinks");

        System.out.println("\nThank you for purchasing Chocolates");
        addStock(new Chocolate());
        addStock(new Chocolate());
        addStock(new Chocolate());
        addStock(new Chocolate());
        addStock(new Chocolate());
        addStock(new Chocolate());
        buy(new Chocolate());

        System.out.println("You have purchase " + getStock(new Chocolate()) + " Chocolates");


    }


}

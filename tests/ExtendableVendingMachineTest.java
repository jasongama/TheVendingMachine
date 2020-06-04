import org.junit.Test;
import vending.ExtendableVendingMachine;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.Assert.assertEquals;

public class ExtendableVendingMachineTest {

    @Test
    public void shouldBuySoftDrinks() {

        ExtendableVendingMachine productBought = new ExtendableVendingMachine(0,0,0);

        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.addStock(new SoftDrink());
        productBought.buy(new SoftDrink());

        assertEquals(3, productBought.getStock(new SoftDrink()));
    }
    @Test
    public void shouldBuyChocolate() {

        ExtendableVendingMachine productBought = new ExtendableVendingMachine(0,2,0);

        productBought.addStock(new Chocolate());
        productBought.addStock(new Chocolate());
        productBought.addStock(new Chocolate());
        productBought.addStock(new Chocolate());
        productBought.buy(new SoftDrink());

        assertEquals(4, productBought.getStock(new Chocolate()));
    }
    @Test
    public void shouldBuySaltySnacks() {

        ExtendableVendingMachine productBought = new ExtendableVendingMachine(0,0,0);

        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        productBought.addStock(new SaltySnack());
        productBought.buy(new SaltySnack());

        assertEquals(2, productBought.getStock(new SaltySnack()));
    }
    @Test
    public void shouldNotABuyProductIfYouHaveNot() {

        ExtendableVendingMachine productBought = new ExtendableVendingMachine(0,0,0);

        assertEquals(0, productBought.getStock(new Product()));
    }
    @Test
    public void shouldNotGotoANegativeNumber() {

        ExtendableVendingMachine productBought = new ExtendableVendingMachine(0,0,0);
        productBought.addStock(new SaltySnack());
        productBought.buy(new SaltySnack());

        assertEquals(0, productBought.getStock(new SaltySnack()));
    }
}

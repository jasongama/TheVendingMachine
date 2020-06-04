import org.junit.Test;
import vending.product.Chocolate;
import vending.product.Product;
import vending.product.SaltySnack;
import vending.product.SoftDrink;

import static org.junit.Assert.assertEquals;

public class ProductTest {
    @Test
    public void shouldTellAProductDescription() {

        Product productDescription = new Product();

        productDescription.description();
        assertEquals("This is a product", productDescription.description());
    }

    @Test
    public void shouldTellASaltySnacksDescription() {

        SaltySnack productDescription = new SaltySnack();

        productDescription.description();
        assertEquals("This are SaltySnacks", productDescription.description());
    }
    @Test
    public void shouldTellASoftDrinksDescription() {

        SoftDrink productDescription = new SoftDrink();

        productDescription.description();
        assertEquals("This are SoftDrinks", productDescription.description());
    }
    @Test
    public void shouldTellAChocolateDescription() {

        Chocolate productDescription = new Chocolate();

        productDescription.description();
        assertEquals("This are chocolates", productDescription.description());
    }
    @Test
    public void shouldAddSaltySnacks() {

        SaltySnack addSaltSnacks = new SaltySnack();

        addSaltSnacks.setGetStock(new SaltySnack());
        addSaltSnacks.setGetStock(new SaltySnack());
        addSaltSnacks.setGetStock(new SaltySnack());
        addSaltSnacks.setGetStock(new SaltySnack());
        assertEquals(4, addSaltSnacks.getSaltySnack());
    }
    @Test
    public void shouldAddSoftDrinks() {

        SoftDrink addSoftDrink = new SoftDrink();

        addSoftDrink.setGetStock(new SoftDrink());
        addSoftDrink.setGetStock(new SoftDrink());
        addSoftDrink.setGetStock(new SoftDrink());
        assertEquals(3, addSoftDrink.getSoftDrink());
    }
    @Test
    public void shouldAddChocolate() {

        Chocolate addSoftDrink = new Chocolate();

        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Chocolate());
        assertEquals(5, addSoftDrink.getChocolate());
    }
    @Test
    public void shouldNotAddProduct() {

        Product addSoftDrink = new Chocolate();

        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Chocolate());
        addSoftDrink.setGetStock(new Product());
        assertEquals(0, addSoftDrink.getStock());
    }

}

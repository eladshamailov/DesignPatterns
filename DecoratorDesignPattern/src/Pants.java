public class Pants extends ShoppingCartDecorator {
    /*
  Extends the decorator and modifying the prices and the products accordingly.
 */

    public Pants(ShoppingCart shoppingCart) {
        super(shoppingCart);
        System.out.println("Added Pants to the cart, the price is 60");
    }

    @Override
    public String getProducts() {
        return super.getProducts()+"Pants";
    }

    @Override
    public int getCost() {
        return super.getCost()+60;    }
}

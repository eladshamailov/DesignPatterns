public class Shirts extends ShoppingCartDecorator {
    /*
  Extends the decorator and modifying the prices and the products accordingly.
 */

    public Shirts(ShoppingCart shoppingCart) {
        super(shoppingCart);
        System.out.println("Added Shirt to the cart, the price is: 20");
    }

    @Override
    public String getProducts() {
        return super.getProducts()+"Shirt, ";
    }

    @Override
    public int getCost() {
        return super.getCost()+20;
    }
}

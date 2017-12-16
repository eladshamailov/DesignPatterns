public class Coats extends ShoppingCartDecorator {
    /*
      Extends the decorator and modifying the prices and the products accordingly.
     */

    public Coats(ShoppingCart shoppingCart) {
        super(shoppingCart);
        System.out.println("Added Coat to the cart, the price is: 30");
    }

    @Override
    public String getProducts() {
            return super.getProducts()+"Coat, ";
    }

    @Override
    public int getCost() {
        return super.getCost()+30;
    }
}

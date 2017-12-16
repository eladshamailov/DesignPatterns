public class ShoppingCartDecorator implements ShoppingCart {

    /*
    The decorator class,
     Implements the interface and has a "Has a" relation ship with it.
     */

    //the object is protected ,because we want to grant access to the childes.
    protected ShoppingCart shoppingCart;

    public ShoppingCartDecorator(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    @Override
    public String getProducts() {
        return shoppingCart.getProducts();
    }

    @Override
    public int getCost() {
        return shoppingCart.getCost();
    }
}

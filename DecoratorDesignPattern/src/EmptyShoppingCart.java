public class EmptyShoppingCart implements ShoppingCart {
    /*
    Implementation of the empty shopping cart. every shopping cart will start as empty shopping cart .
     */

    public EmptyShoppingCart() {
        System.out.println("Empty shopping cart is for free");
    }

    @Override
    public String getProducts() {
        return "";
    }

    @Override
    public int getCost() {
        return 0;
    }
}

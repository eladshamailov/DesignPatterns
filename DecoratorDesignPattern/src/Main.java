public class Main {
    public static void main(String[] args){
        /*
        We want to create a Shopping cart And set it as a empty shopping cart.
        After the shopping cart is empty , we want to getCost Shirts, pants and coats while the
        price and the product string of the shopping cart are updated.
         */

        ShoppingCart shoppingCart=new Pants(new Coats(new Shirts(new EmptyShoppingCart())));
        System.out.println();
        System.out.println("Items in the shopping cart:"+shoppingCart.getProducts());
        System.out.println("The price of the shopping cart is: "+shoppingCart.getCost());
    }
}

// The Observers update method is called when the store changes prices.

public interface Observer {

    public void update(double breadPrice, double milkPrice, double meatPrice);

}
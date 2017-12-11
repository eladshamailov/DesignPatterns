import java.util.ArrayList;

// Uses the Client interface to update all Observers.

public class HandleStores implements Client {

    private ArrayList<Observer> observers;
    private double milkPrice;
    private double breadPrice;
    private double meatPrice;

    public HandleStores(){
        //All clients that want to be updated at the prices.
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    public void unregister(Observer deleteMe) {
        int deleteIndex = observers.indexOf(deleteMe);
        System.out.println("Observer " + (deleteIndex+1) + " deleted");
        observers.remove(deleteIndex);
    }

    @Override
    public void notifyTheClients() {
        //Notify all the clients about the new prices.
        for(Observer o : observers){
            o.update(milkPrice, breadPrice, meatPrice);
        }
    }

    //Set the relevant price, and let everyone else now about the new price.
    public void setMilkPrice(double milkPrice) {
        System.out.println("Milk price has changed!");
        this.milkPrice = milkPrice;
        notifyTheClients();
    }

    public void setBreadPrice(double breadPrice) {
        System.out.println("Bread price has changed!");
        this.breadPrice = breadPrice;
        notifyTheClients();
    }

    public void setMeatPrice(double meatPrice) {
        System.out.println("Meat price has changed!");
        this.meatPrice = meatPrice;
       notifyTheClients();
    }
}

// Represents each Observer that is updating prices as a Client

public class StoreObserver implements Observer {

    private double milkPrice;
    private double breadPrice;
    private double meatPrice;
    private static int numOfClients = 0;  //Static variable to count all the clients.
    private int clientObserverId;
    private Client client;

    public StoreObserver(Client newClient){
        this.client = newClient;
        this.clientObserverId = numOfClients;
        numOfClients++;
        System.out.println("New Client Observer " + this.clientObserverId);
        client.register(this); //Add the client to the array list of the price followers.
    }

    public void update(double milkPrice, double breadPrice, double meatPrice) {
        this.milkPrice = milkPrice;
        this.breadPrice = breadPrice;
        this.meatPrice = meatPrice;
        printThePrices();
    }

    public void printThePrices(){
        System.out.println("Client number "+ clientObserverId + "\n Milk: " + milkPrice + "\n Bread: " +
                breadPrice + "\n Meat: " + meatPrice + "\n");
    }
}

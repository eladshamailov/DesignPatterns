package ObserverPack;

public class main {
    public static void main(String [] args){

    /*Let's say that we have a few supermarkets that wishes to know some of their competitors prices,
      and match their prices according to the newest supermarket that has joined the app.
      At this project, we wil represent them as Clients of our app.
      They will be able to register to our app,unregister and notify other companies about their prices.
      After they will register, and change the prices, they will use the update method of the ObserverPack.Observer interface,
      this method will update the values and print them to all the registered clients.
    */

        // Running example
        // Create the ObserverPack.Client object => HandleStore.
        // It will handle updating all clients as well as deleting and adding them.
        HandleStores handleStore = new HandleStores();
        StoreObserver observer1 = new StoreObserver(handleStore);
        handleStore.setMilkPrice(5.8);
        handleStore.setBreadPrice(4.7);
        handleStore.setMeatPrice(90.2);
        StoreObserver observer2 = new StoreObserver(handleStore);
        handleStore.setMilkPrice(10.00);
        handleStore.setBreadPrice(10.00);
        handleStore.setMeatPrice(20.00);

        // Delete one of the observers
        handleStore.unregister(observer2);

        handleStore.setMilkPrice(1.60);
        handleStore.setBreadPrice(2.00);
        handleStore.setMeatPrice(74.57);

        handleStore.unregister(observer1);
    }
}

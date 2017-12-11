// This interface handles adding and deleting stores that wish to get updates about prices.

public interface Client {

    public void register(Observer o);

    public void unregister(Observer o);

    public void notifyTheClients();
}

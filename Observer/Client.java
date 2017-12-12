// This interface handles adding and deleting stores that wish to get updates about prices.

public interface Client {

    public void addClient(Observer o);

    public void removeClient(Observer o);

    public void notifyTheClients();
}

package SingletonPack;
public class main {

    private static void doSomeStuff() {
        System.out.println("Doing some stuff....");
        try {
            Thread.currentThread();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String []args)
    {
        System.out.println("Creating first singleton...");
        Singleton singleton1= Singleton.getInstance();
        System.out.println("1st Instance ID: " + System.identityHashCode(singleton1));
        doSomeStuff();
        System.out.println("Trying to create another instance of the singleton...");
        Singleton singleton2= Singleton.getInstance();
        System.out.println("2nd Instance ID: " + System.identityHashCode(singleton2));
        System.out.println("The same id = the same instance of singleton.");
    }
}

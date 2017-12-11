package SingletonPack;
public class Singleton {

    private static Singleton onlyInstance = null;

    private Singleton(){}

    public static Singleton getInstance() {

        /* If the instance isn't null-  it means we already created an instance, so we will return the old one.
           if it is null- this is the first creation of onlyInstance, so we create it.
           This implementation is Thread Safe.*/
            synchronized(Singleton.class){
                if(onlyInstance == null) {
                    onlyInstance = new Singleton();
                }
            }
        return onlyInstance;
    }
}

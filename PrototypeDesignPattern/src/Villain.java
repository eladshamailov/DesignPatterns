public interface Villain extends Cloneable {
    // the class is Cloneable, which means it is ok to copy instances of this class
    public Villain clone();

    // for testing purposes , we want to know the hashcode
    public int getHashCode();
}

public class CloneFactory {
    /*
    this factory receives a Villain or one of it's subclasses , makes a clone and stores it in the memory
     */
    public Villain getVillain(Villain villain){
        return villain.clone();
    }
}

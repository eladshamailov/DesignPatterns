public class Magician implements Villain {

    private int id;

    public Magician(){
        this.id=(int)(100*Math.random());
    }

    @Override
    public Villain clone() {
        //calls Villain clone
        Magician magician=null;
        try {
            magician=(Magician) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return magician;
    }

    public int getHashCode(){
       return System.identityHashCode(this);
    }

    public int getId(){
        return this.id;
    }

}

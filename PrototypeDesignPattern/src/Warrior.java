public class Warrior implements Villain {

    private int id;

    public Warrior(){
        this.id=(int)(100*Math.random());
    }

    @Override
    public Villain clone() {
        //calls Villain clone
        Warrior warrior=null;
        try {
            warrior=(Warrior) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return warrior;
    }

    @Override
    public int getHashCode() {
        return System.identityHashCode(this);
    }

    public int getId(){
        return this.id;
    }
}

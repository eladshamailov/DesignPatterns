public class Sniper implements Villain {

    private int id;

    public Sniper(){
        this.id=(int)(100*Math.random());
    }
    @Override
    public Villain clone() {
        //calls Villain clone
        Sniper sniper=null;
        try {
            sniper=(Sniper) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sniper;
    }

    public int getHashCode(){
        return System.identityHashCode(this);
    }

    public int getId(){
        return this.id;
    }
}

public class Sniper implements Villain {

    @Override
    public void specialAbility() {
        System.out.println("I can use my sniper rifle!");
    }

    @Override
    public void useAbility() {
        System.out.println("sniper rifle shoot shoot!");
    }
}
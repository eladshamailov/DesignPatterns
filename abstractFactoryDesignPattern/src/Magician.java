public class Magician implements Villain {

    @Override
    public void specialAbility() {
        System.out.println("I can use magic!");
    }

    @Override
    public void useAbility() {
        System.out.println("taste the magic!");
    }
}
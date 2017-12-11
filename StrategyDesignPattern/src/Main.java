public class Main {

    public static void main(String[] args){

        Animal shuki = new Dog("shuki",60,30); //creates new dog
        Animal mikey = new Mouse("mikey",10,4); //creates new mouse
        Animal roni = new Shark("roni",26,10); //creates new shark
        System.out.println("I'm a dog and my name is: "+shuki.getName());
        System.out.println("I'm a mouse and my name is: "+mikey.getName());
        System.out.println("I'm a shark and my name is: "+roni.getName());
        System.out.println();
        System.out.println("Dog: " + shuki.tryToRun());
        System.out.println("Mouse: " + mikey.tryToRun());
        System.out.println("Shark: " + roni.tryToRun());


        // This allows dynamic changes for runs
        roni.setRunning(new CanRun());
        System.out.println("After dynamic changes for Run");
        // now the shark can run
        System.out.println("Shark: " + roni.tryToRun());

    }

}
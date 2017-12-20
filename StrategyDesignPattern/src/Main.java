public class Main {

    public static void main(String[] args){
        /*
        We create animal class and Dog,Shark and mouse classes that extend Animal/
        The Runs insatnce has one function , isRun().
         In the Animal class , we use an instance variable that is a subclass of the Runs interface.
        Animal doesn't care what Runs does , it's just knows we can use it.
         Instead of inheriting an ability through inheritance, the class is composed
         with objects with the right ability
         We are not inheriting abilities , we are using the Runs that has the desired ability.
        in this way , we can change the behavior at run time
        */

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

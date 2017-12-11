public class Dog extends Animal{


    public Dog(String name, int height, int weight){

        super(name,height,weight);
        // sets the sound of the dog
        setSound("BarkBarkBarkBark");
        /*We set the behavior of the dog.
          The dog can run
         */
        super.runs = new CanRun();

    }

    public void bark(){

        System.out.println("Bark");

    }

}
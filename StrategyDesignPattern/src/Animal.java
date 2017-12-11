public class Animal {

    /*
 we use an instance variable that is a subclass of the Runs interface.

 Animal doesn't care what Runs does , it's just knows we can use it.

 Instead of inheriting an ability through inheritance, the class is composed
 with objects with the right ability

 We are not inheriting abilities , we are using the Runs that has the desired ability.
in this way , we can change the behavior at run time

*/

    private String name;
    private int height;
    private int weight;
    private String sound;
    public Runs runs;

    // The constructor of the class
    public Animal(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    // returns the name of the animal
    public String getName() {
        return name;
    }
    // sets the name of the animal

    public void setName(String name) {
        this.name = name;
    }
    // returns the height of the animal

    public int getHeight() {
        return height;
    }
    // sets the height of the animal

    public void setHeight(int height) {
        this.height = height;
    }
    // returns the weight of the animal

    public int getWeight() {
        return weight;
    }
    // sets the weight of the animal

    public void setWeight(int weight) {
        this.weight = weight;
    }
    // returns the sound of the animal

    public String getSound() {
        return sound;
    }
    // sets the sound of the animal

    public void setSound(String sound) {
        this.sound = sound;
    }

    //returns if the animal can run
    public String tryToRun(){

        return runs.isRun();

    }

    // The class behavior can be changed at run time

    public void setRunning(Runs runs){

        this.runs = runs;

    }

}
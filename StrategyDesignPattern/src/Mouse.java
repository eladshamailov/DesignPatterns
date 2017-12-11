public class Mouse extends Animal {

    public Mouse(String name, int height, int weight) {
        super(name, height, weight);
        // sets the sound of the mouse
        setSound("ChiChiChiChi");
        /*We set the behavior of the mouse.
          The mouse can run
         */
        super.runs = new CanRun();
    }
}

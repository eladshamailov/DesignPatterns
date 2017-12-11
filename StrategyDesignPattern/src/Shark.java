public class Shark extends Animal{


    public Shark(String name, int height, int weight){

        super(name,height,weight);
        // sets the sound of the bird
        setSound("SplashSplashSplashSplash");
     /*We set the behavior of the shark.
          The shark can't run
         */
        super.runs = new CantRun();

    }

    public void swimDeeper(int num){
        setHeight(getHeight()- num);
    }

}
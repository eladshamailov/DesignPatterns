package BuilderPack;

public class Main {
    /*
    We will create 2 engineers, which will implement the Worker interface.
    They will be able to build a car using the CarBuilder Methods (both will use this class).
    Each Worker has a field of Car in his class. so he can build it while using CarPlan interface methods.
     */

    public static void main(String[] args)
    {
        MustangWorker engineer1 = new MustangWorker();
        MazdaWorker engineer2= new MazdaWorker();
        CarBuilder carBuilder1 = new CarBuilder(engineer1);
        CarBuilder carBuilder2 = new CarBuilder(engineer2);

        carBuilder1.buildACar();
        carBuilder2.buildACar();

        Car car1 = carBuilder1.getCar();
        Car car2 = carBuilder2.getCar();

        System.out.println("Two brands of cars were made by using the Builder design pattern:");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}

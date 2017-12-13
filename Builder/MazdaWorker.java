package BuilderPack;

public class MazdaWorker implements Worker {
    private Car car;
    private String wheels;
    private String gear;
    private String engine;
    private String color;

    public MazdaWorker(){
        this.car=new Car();
    }
    @Override
    public void bulidEngine() {
        car.setEngine("Mazda Engn 3.5L, V6");
    }

    @Override
    public void buildGear() {
        car.setGear("Automatic");
    }

    @Override
    public void assembleWheels() {
        car.setWheels("Black TBS Wheels 1997");
    }

    @Override
    public void paintTheCar() {
        car.setCarColor("Green");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}

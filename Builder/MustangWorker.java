package BuilderPack;

public class MustangWorker implements Worker {
    private Car car;
    private String wheels;
    private String gear;
    private String engine;
    private String color;

    public MustangWorker(){
        this.car=new Car();
    }
    @Override
    public void bulidEngine() {
        car.setEngine("Mustang D-code, 5.0L V8");
    }

    @Override
    public void buildGear() {
        car.setGear("Manual");
    }

    @Override
    public void assembleWheels() {
        car.setWheels("Silver AMR Wheels 2018");
    }

    @Override
    public void paintTheCar() {
        car.setCarColor("Red");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}

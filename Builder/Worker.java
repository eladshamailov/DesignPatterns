package BuilderPack;
//This class is known as Director at the Builder design pattern.

public interface Worker {
    public void bulidEngine();
    public void buildGear();
    public void assembleWheels();
    public void paintTheCar();
    public Car getCar();
}

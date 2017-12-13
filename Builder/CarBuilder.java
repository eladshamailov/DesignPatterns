package BuilderPack;

public class CarBuilder {
    private Worker worker;

    public CarBuilder(Worker worker)
    {
        this.worker = worker;
    }

    public void buildACar()
    {
        this.worker.bulidEngine();
        this.worker.buildGear();
        this.worker.assembleWheels();
        this.worker.paintTheCar();
    }

    public Car getCar()
    {
        return this.worker.getCar();
    }

}


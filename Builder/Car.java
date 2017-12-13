package BuilderPack;

public class Car implements CarPlan {
    private String wheels;
    private String gear;
    private String engine;
    private String color;

    @Override
    public void setWheels(String wheels) {
        this.wheels=wheels;
    }

    @Override
    public void setGear(String gear) {
        this.gear=gear;
    }

    @Override
    public void setEngine(String engine) {
        this.engine=engine;
    }

    @Override
    public void setCarColor(String color) {
    this.color=color;
    }
    public String toString(){
        return "A Car was made of the following parts: Engine: "+ engine + " , Wheels: " + wheels + ", Gear: " + gear + " , Car color: " + color;
    }

}

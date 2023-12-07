public abstract class CarBuilder {
    Car car;

    public void creatCar(){
        car = new Car();
    }
    abstract public void buildBrand(String brand);
    abstract public void buildColor(String color);
    abstract public void buildModel(String model);

    public Car getCar() {
        return car;
    }
}

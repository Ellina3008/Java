public class Automobile extends CarBuilder{


    @Override
    public void buildBrand(String brand) {
        car.setBrand(brand);
    }

    @Override
    public void buildColor(String color) {
        car.setColor(color);
    }

    @Override
    public void buildModel (String model) {
        car.setModel(model);
    }
}

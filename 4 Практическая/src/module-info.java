package supermarket;

public class Supermarket {
    private String nameOtdela;
    private String name;
    private String country;
    private double retailPrice;
    private String nameSourse;

    public Supermarket(String nameOtdela, String name, String country, double retailPrice){
        this.nameOtdela = nameOtdela;
        this.name = name;
        this.country = country;
        this.retailPrice = retailPrice;
    }

    public String getNameOtdela() {
        return nameOtdela;
    }

    public void setNameOtdela(String nameOtdela) {
        this.nameOtdela = nameOtdela;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getNameSourse() {
        return nameSourse;
    }

    public void setNameSourse(String nameSourse) {
        this.nameSourse = nameSourse;
    }

    @Override
    public String toString() {
        return "Информация о супермаркете:\n" +
                "Название отдела: " + nameOtdela +
                "\nНаименование товара: " + name +
                "\nСтрана производитель: " + country +
                "\nРозничная цена: " + retailPrice +
                "\nПоставщик: " + nameSourse;
    }
}

package supermarket;

public class Toy extends Supermarket{
    private String ageGroup;
    private String type;
    public Toy(String nameOtdela, String name, String country, double retailPrice,String ageGroup, String type){
        super(nameOtdela, name, country, retailPrice);
        this.ageGroup = ageGroup;
        this.type = type;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nИгрушка: " +
                "\nВозрастная группа: " + ageGroup + '\'' +
                "\nТип: " + type;
    }
}


package supermarket;

public class Fruit extends Supermarket{
    private String maxStorageTime;
    private String temperature;

    public Fruit(String nameOtdela, String name, String country, double retailPrice, String maxStorageTime, String temperature) {
        super(nameOtdela, name, country, retailPrice);
        this.maxStorageTime = maxStorageTime;
        this.temperature = temperature;
    }

    public String getMaxStorageTime() {
        return maxStorageTime;
    }

    public void setMaxStorageTime(String maxStorageTime) {
        this.maxStorageTime = maxStorageTime;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nФрукты: " +
                "\nВремя хранения: " + maxStorageTime + '\'' +
                "\nТемпература: " + temperature;
    }
}



package supermarket;

public class DimensionalGood extends Supermarket{
    private double height;
    private double width;
    private double length;

    public DimensionalGood(String nameOtdela, String name, String country, double retailPrice, double height, double width, double length) {
        super(nameOtdela, name, country, retailPrice);
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "\nГабартиный товар: " +
                "\nВысота: " + height +
                "\nШирина: " + width +
                "\nДлина: " + length;
    }
}


package supermarket;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Supermarket> supermarket;

    public Store(){
        supermarket = new ArrayList<>();
    }

    public void addItem(Supermarket item){
        supermarket.add(item);
    }

    public void printList(){
        for(int i=0; i<supermarket.size();i++){
            System.out.println(i+1 + ")");
            System.out.println(supermarket.get(i).toString());
            System.out.println();
        }
    }

}

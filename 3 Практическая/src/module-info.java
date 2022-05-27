package supermarket;

public class Supermarket {
    private String nameOtdela;
    private int productCode;
    private String name;
    private String country;
    private double retailPrice;
    private String nameSourse;

    public Supermarket(String nameOtdela, int productCode, String name, String country, double retailPrice){
        this.nameOtdela = nameOtdela;
        this.productCode = productCode;
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

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
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
                "\nКод товара: " + productCode +
                "\nНаименование товара: " + name +
                "\nСтрана производитель: " + country +
                "\nРозничная цена: " + retailPrice +
                "\nПоставщик: " + nameSourse;
    }
}
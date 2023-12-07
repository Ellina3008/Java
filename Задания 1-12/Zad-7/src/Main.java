import java.util.Scanner;

public class Main {
    static CarBuilder builder = new Automobile();
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("""
                ---MENU---
                1. Создать Car
                0. Exit
                """);

        switch (scanner.nextInt()){
            case 1 -> create();
            case 0 -> System.exit(0);
            default -> throw new RuntimeException("Нет такого выбора");
        }
    }
    public static void create(){
        builder.creatCar();
        System.out.println("Введите бренд");
        builder.buildBrand(scanner.next());
        System.out.println("Введите модель");
        builder.buildModel(scanner.next());
        System.out.println("Введите цвет");
        builder.buildColor(scanner.next());

        Car car = builder.getCar();

        System.out.println(car);

    }
}
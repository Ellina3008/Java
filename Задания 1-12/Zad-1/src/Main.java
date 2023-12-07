import Furniture.*;

import java.util.Scanner;

public class Main {
    private static Furnitures furnitures = null;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("""
                1. Стул
                2. Стол
                3. Шкаф
                """);
        FactoryFurniture factoryFurniture = start(scanner.nextInt());

        factoryFurniture.action(furnitures);
    }
    private static FactoryFurniture start( int a){
        if (a == 1){
            furnitures = new Furnitures("Стул");
            return new FactoryChairs();
        } else if (a == 2) {
            furnitures = new Furnitures("Стол");
            return new FactoryTable();
        } else if (a == 3) {
            furnitures = new Furnitures("Шкаф");
            return new FactoryCloset();
        }else {
            throw new RuntimeException("Нет такого животного!!!!!!");
        }
    }
}
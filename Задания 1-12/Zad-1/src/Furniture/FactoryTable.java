package Furniture;

import java.util.Scanner;

public class FactoryTable implements FactoryFurniture {
    Scanner scanner = new Scanner(System.in);
    @Override
    public void action(Furnitures furnitures) {
        String act;
        System.out.println("""
                1. Передвинуть
                2. Собрать
                3. Разобрать
                """);
        switch ( scanner.nextInt() ){
            case 1 -> act = "передвинули";
            case 2 -> act = "собрали";
            case 3 -> act = "разобрали";
            default -> throw new RuntimeException("Нет такого действия!");
        }
        furnitures.setAction(act);
        System.out.println( furnitures.getName() +" "+  furnitures.getAction() );
    }
}

package OrderTickets;

import java.util.Scanner;

public class Places {
    public String setPlaces(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Кино
                2. Теарт
                """);
        switch (scanner.nextInt()){
            case 1 -> {
                return "Кино";
            }
            case 2 -> {
                return "Теарт";
            }
        }
        return null;
    }
}

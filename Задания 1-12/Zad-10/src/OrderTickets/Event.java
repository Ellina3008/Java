package OrderTickets;

import java.util.Scanner;

public class Event {
    public String setEvent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Тарас Бульба
                2. Форсаж
                """);
        switch (scanner.nextInt()){
            case 1 -> {
                return "Тарас Бульба";
            }
            case 2 -> {
                return "Форсаж";
            }
        }
        return null;
    }
}

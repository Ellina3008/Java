package OrderTickets;

import java.util.Scanner;

public class Payment {
    public String setPayment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Карта
                2. Наличка
                """);
        switch (scanner.nextInt()){
            case 1 -> {
                return "Карта";
            }
            case 2 -> {
                return "Наличка";
            }
        }
        return null;
    }
}

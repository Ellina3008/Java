import Adapter.Action;
import Adapter.AdapterPayPal;
import Adapter.AdapterSquare;
import Adapter.AdapterStripe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Action action = null;

        System.out.println("""
                1. Paypal
                2. Square
                3. Stripe
                """);
        switch (scanner.nextInt()){
            case 1 -> action = new AdapterPayPal();
            case 2 -> action = new AdapterSquare();
            case 3 -> action = new AdapterStripe();
        }
        action.connect();
    }
}
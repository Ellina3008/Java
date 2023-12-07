package Adapter;

import PaymentGateways.Square;

public class AdapterSquare extends Square implements Action {
    @Override
    public void connect() {
        connector();
    }
}

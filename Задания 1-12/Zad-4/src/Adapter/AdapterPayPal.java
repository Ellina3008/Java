package Adapter;

import PaymentGateways.PayPal;

public class AdapterPayPal extends PayPal implements Action {
    @Override
    public void connect() {
        connector();
    }
}

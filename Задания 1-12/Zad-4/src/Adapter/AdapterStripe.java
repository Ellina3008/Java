package Adapter;

import PaymentGateways.Stripe;

public class AdapterStripe extends Stripe implements Action {
    @Override
    public void connect() {
        connector();
    }
}

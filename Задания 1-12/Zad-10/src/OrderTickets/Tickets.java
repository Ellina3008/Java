package OrderTickets;

public class Tickets {
    private String event;
    private String places;
    private String payment;

    public Tickets(String event, String places, String payment) {
        this.event = event;
        this.places = places;
        this.payment = payment;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Tickets{" +
                "event=" + event +
                ", places=" + places +
                ", payment=" + payment +
                '}';
    }
}

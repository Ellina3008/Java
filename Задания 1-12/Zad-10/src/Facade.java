import OrderTickets.Event;
import OrderTickets.Payment;
import OrderTickets.Places;
import OrderTickets.Tickets;

public class Facade {

    Event event = new Event();
    Places places = new Places();
    Payment payment = new Payment();

    Tickets tickets = new Tickets(null,null,null);

    public void setEvent(){
        tickets.setEvent(event.setEvent());
    }

    public void setPlaces(){
        tickets.setPlaces(places.setPlaces());
    }

    public void setPayment(){
        tickets.setPayment(payment.setPayment());
    }
    public void show(){
        System.out.println(tickets);
    }
}

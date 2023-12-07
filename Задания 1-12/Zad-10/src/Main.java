public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.setEvent();
        facade.setPlaces();
        facade.setPayment();

        facade.show();
    }
}
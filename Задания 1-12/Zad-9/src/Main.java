public class Main {
    public static void main(String[] args) {
       ConnectLog.getConnectLog().set("Открылось приложение");
       ConnectLog.getConnectLog().set("Закрылось приложение");
       ConnectLog.getConnectLog().show();
    }
}
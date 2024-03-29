package Interface;

public interface Observed {
    void addWeather(String weather);
    void removeWeather(String weather);
    void addObserver(Observer observer);
    void notifyObserver();
}

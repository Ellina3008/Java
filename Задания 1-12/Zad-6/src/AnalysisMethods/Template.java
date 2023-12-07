package AnalysisMethods;

public abstract class Template {
    public void print(){
        System.out.println("\n========================\n");

        System.out.println("Начали метод анализа");
        show();
        System.out.println("Закончили метод анализа");
    }

    public abstract void show();
}

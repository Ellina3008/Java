import AnalysisMethods.GeneticAlgorithms;
import AnalysisMethods.MachineLearning;
import AnalysisMethods.Statistics;
import AnalysisMethods.Template;

public class Main {
    public static void main(String[] args) {
        Template geneticAlgorithms = new GeneticAlgorithms();
        Template machineLearning = new MachineLearning();
        Template statistics = new Statistics();

        geneticAlgorithms.print();
        machineLearning.print();
        statistics.print();
    }
}
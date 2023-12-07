public class Main {
    public static void main(String[] args) {
        Report report = new Report("Отчет","Содержание отчета");

        System.out.println(report);

        Report reportClone = report.copy();
        reportClone.setContent("Измененное содержание отчета");
        System.out.println("""
                ==================
                """ + reportClone);
    }
}
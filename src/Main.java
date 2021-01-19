public class Main {
    public static void main(String[] args){
        Employee Maik = new Employee(" Имя: - Maik", 20, 10000);
        Maik.Work();

        Specialist Carl = new Specialist(" Имя: - Carl", 28, 25000);
        Carl.setLevels(10);
        Carl.workWithClients();

        Specialist Shown = new Specialist(" Имя: - Shown", 29, 25000);
        Shown.setLevels(10);
        Shown.workWithClients();

        Specialist Kane = new Specialist(" Имя: - Kane", 27, 25000);
        Kane.setLevels(10);
        Kane.workWithClients();

        Developer Casa = new Developer(" Имя: - Casa", 23, 30000);
        Casa.setGrades(" Middle ");
        Casa.writeCode();

        Developer John = new Developer(" Имя: - John", 29, 80000);
        John.setGrades("High");
        John.writeCode();

        Developer Margaret = new Developer(" Имя: - Margaret", 23, 30000);
        Margaret.setGrades(" Middle ");
        Margaret.writeCode();

        Developer Maddison = new Developer(" Имя: - Maddison ", 24, 30000);
        Maddison.setGrades(" Middle ");
        Maddison.writeCode();

        Manager Mark = new Manager(" Имя: - Mark", 32, 45000);
        Mark.setHasStocks(true);
        Mark.writeProcedures();

        Manager Katcher = new Manager(" Имя: - Katcher", 30, 25000);
        Mark.setHasStocks(true);
        Katcher.writeProcedures();

        CEO ceo1 = new CEO(" Имя: - Bruce", 35, 30000);
        ceo1.setHasCompanyCar(true);
        ceo1.goPublic();

        //now do ----------------------------------------------------------------------
        //пока сильна Джава , будет развиваться С++ ----------------------------------------------------------------------

        //java gosling ----------------------------------------------------------------------

    }
}

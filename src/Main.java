public class Main {
    public static void main(String[] args){
        Employee Maik = new Employee();
        Maik.setName("Maik");
        Maik.setSalary(10000);
        Maik.setAge(20);
        Maik.Work();

        System.out.println(Maik.getName());
        System.out.println(Maik.getSalary());
        System.out.println(Maik.getAge());


        Specialist Carl = new Specialist(10);
        Carl.setName("Carl");
        Carl.setSalary(25000);
        Carl.setAge(28);
        Carl.workWithClients();

        System.out.println(Carl.getName());
        System.out.println(Carl.getLevels());
        System.out.println(Carl.getSalary());
        System.out.println(Carl.getAge());

        Specialist Shown = new Specialist(10);
        Shown.setName("Shown");
        Shown.setSalary(25000);
        Shown.setAge(29);
        Shown.workWithClients();

        System.out.println(Shown.getName());
        System.out.println(Shown.getLevels());
        System.out.println(Shown.getSalary());
        System.out.println(Shown.getAge());

        Specialist Kane = new Specialist(10);
        Kane.setName("Kane");
        Kane.setSalary(25000);
        Kane.setAge(27);
        Kane.workWithClients();

        System.out.println(Kane.getName());
        System.out.println(Kane.getLevels());
        System.out.println(Kane.getSalary());
        System.out.println(Kane.getAge());


        Developer Casa = new Developer();
        Casa.setGrades("Middle");
        Casa.setName("Casa");
        Casa.setSalary(30000);
        Casa.setAge(23);
        Casa.writeCode();

        System.out.println(Casa.getGrades());
        System.out.println(Casa.getName());
        System.out.println(Casa.getSalary());
        System.out.println(Casa.getAge());

        Developer John = new Developer();
        John.setGrades("High");
        John.setName("Casa");
        John.setSalary(80000);
        John.setAge(29);
        John.writeCode();

        System.out.println(John.getGrades());
        System.out.println(John.getName());
        System.out.println(John.getSalary());
        System.out.println(John.getAge());

        Developer Margaret = new Developer();
        Margaret.setGrades("Middle");
        Margaret.setName("Casa");
        Margaret.setSalary(30000);
        Margaret.setAge(23);
        Margaret.writeCode();

        System.out.println(Margaret.getGrades());
        System.out.println(Margaret.getName());
        System.out.println(Margaret.getSalary());
        System.out.println(Margaret.getAge());

        Developer Maddison = new Developer();
        Maddison.setGrades("Middle");
        Maddison.setName("Casa");
        Maddison.setSalary(30000);
        Maddison.setAge(24);
        Maddison.writeCode();

        System.out.println(Maddison.getGrades());
        System.out.println(Maddison.getName());
        System.out.println(Maddison.getSalary());
        System.out.println(Maddison.getAge());

        Manager Mark = new Manager(true);
        Mark.setName("Mark");
        Mark.setSalary(45000);
        Mark.setAge(32);
        Mark.writeProcedures();

        System.out.println(Mark.getName());
        System.out.println(Mark.getName());
        System.out.println(Mark.getSalary());
        System.out.println(Mark.getAge());

        Manager Katcher = new Manager(true);
        Katcher.setName("Katcher");
        Katcher.setSalary(25000);
        Katcher.setAge(30);
        Katcher.writeProcedures();

        System.out.println(Katcher.getName());
        System.out.println(Katcher.getName());
        System.out.println(Katcher.getSalary());
        System.out.println(Katcher.getAge());

        CEO ceo1 = new CEO(true);
        ceo1.setName("Bruce");
        ceo1.setSalary(30000);
        ceo1.setAge(35);
        ceo1.goPublic();

        System.out.println(ceo1.getName());
        System.out.println(ceo1.getSalary());
        System.out.println(ceo1.getAge());
    }
}

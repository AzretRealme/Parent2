import child.*;
import parent.Employee;

public class Main {
    public static void main(String[] args){


        Employee[] arr = new Employee[] {
                new Manager(" Имя: - Mark", 32, 45000), new Manager(" Имя: - Katcher", 30, 25000),
                new Developer(" Имя: - Casa", 23, 30000), new Developer(" Имя: - John", 29, 80000),
                new Developer(" Имя: - Maddison ", 24, 30000), new Developer(" Имя: - Margaret", 23, 30000),
                new Specialist(" Имя: - Carl", 28, 25000), new Specialist(" Имя: - Shown", 29, 25000),
                new Specialist(" Имя: - Kane", 27, 25000), new CEO(" Имя: - Bruce", 35, 30000)
        };

        /*for(Employee easyItCompany: arr){
            easyItCompany.goToVacation();
        }*/
        
        for(Employee easyItCompany: arr){
            easyItCompany.goToDayOff();
        }

        /*
        Интеллект - это способность избегать выполнения работы,
             но так, чтобы она при это была сделана.

        /*
        Интеллект - это способность избегать выполнения работы,
             но так, чтобы она при это была сделана.
                -------- Linux T.
         */

    }
}

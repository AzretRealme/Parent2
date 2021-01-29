public abstract class Employee {

    private String name;
    private int age;
    private double salary;


    public Employee() {

    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Work(){
        System.out.println(" Emloyee - awesome writing.  ---" + getName() + ", ЗАРПЛАТА: " + getSalary() + ", ВОЗРАСТ: " + getAge());
    }

    public void goToVacation(){
        System.out.println(" Employee say: I am going to Sochi ");
    }

    abstract public void goToDayOff();

}

public class Employee {
    private double salary;
    private String name;
    private int age;

    public Employee() {

    }
    public Employee(double salary) {

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

        System.out.println("Emloyee" + " Work");
    }
}

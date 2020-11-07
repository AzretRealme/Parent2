public class Specialist extends Employee{
    private int levels;
    private double salary;
    private String name;
    private int age;

    public Specialist() {

    }
    public Specialist(int levels) {

        this.levels = levels;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getLevels() {

        return levels;
    }

    public void setLevels(int levels) {

        this.levels = levels;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void workWithClients(){
        System.out.println("Specialist " + " workWithClients ");
    }
}

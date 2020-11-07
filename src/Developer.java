public class Developer extends Employee{
    private String grades;
    private String name;
    private int age;
    private double salary;

    public Developer() {

    }
    public Developer(String grades) {
        this.grades = grades;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
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

    public void writeCode(){
        System.out.println("Developers" + " WriteCode");
    }
}

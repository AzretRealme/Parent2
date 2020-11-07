public class CEO extends Employee{
    private boolean hasCompanyCar = true;
    private String name;
    private double salary;
    private int age;

    public void sethasCompanyCar(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }
    public boolean gethasCompanyCar() {
        return hasCompanyCar;
    }

    public CEO(boolean hasCompanyCar) {
        this.hasCompanyCar = hasCompanyCar;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
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

    public void goPublic(){
        System.out.println("CEO" + " Work IPO");
    }
}

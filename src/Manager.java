public class Manager extends Employee{
    private String name;
    private boolean hasStocks = true;
    private double salary;
    private int age;
    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }
    public boolean getHasStocks() {
        return hasStocks;
    }

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
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

    public void writeProcedures(){
        System.out.println("Managers " + " WriteProcedures");
    }
}

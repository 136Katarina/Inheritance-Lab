package Staff;

public class Employee {
    protected String name;
    protected String NI;
    protected double salary;

    public Employee (String name, String NI, double salary){
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public double payBonus() {
        double salary = this.salary;
        return salary/ 100 ;
    }

    public void setName(String inputName) {
        if (inputName != null || inputName != " ")
            this.name = inputName;
        else name = name;

    }
}


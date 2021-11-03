package models;

public class Staff {
    private String name;
    private String type;
    private int status;
    private double salary;

    public Staff(String name, String type, int status, double salary) {
        this.name = name;
        this.type = type;
        this.status = status;
        this.salary = salary;
    }

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", status=" + status +
                ", salary=" + salary +
                '}';
    }
}

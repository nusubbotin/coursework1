package staffBook;

public class Employee {
    private static int sequence = 0;

    private final int id;
    private String fio;
    private Department department;
    private float salary;

    public Employee(String fio, Department department, float salary) {
        this.id = genSeqNextVal();
        this.fio = fio;
        this.department = department;
        this.salary = salary;
    }

    public static void resetSequence() {
        Employee.sequence = 0;
    }

    private static int genSeqNextVal() {
        return sequence++;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public Department getDepartment() {
        return department;
    }

    public float getSalary() {
        return salary;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}' + "\n";
    }
}

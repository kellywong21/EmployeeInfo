package sg.edu.rp.c346.employeeinfo;

public class Employee {
    private String name;
    private String title;
    private String Salary;

    public Employee(String name, String title, String salary) {
        this.name = name;
        this.title = title;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }
    public String toString(){
        return name +" "+  title + Salary;
    }


}

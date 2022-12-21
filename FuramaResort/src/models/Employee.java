package models;

public class Employee extends Person {
    enum Level {
        Intermediate,
        College,
        University,
        AfterUniversity
    }

    enum Role {
        Receptionist, // le tan
        Waiter, // phuc vu
        Expert, // chuyen vien
        Supervisor, // giam sat vien
        Manager, // quan ly
        Direction // giam doc
    }

    Level level;
    Role role;
    double salary;

    public Employee() {
    }

    public Employee(Level level, Role role, double salary) {
        this.level = level;
        this.role = role;
        this.salary = salary;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

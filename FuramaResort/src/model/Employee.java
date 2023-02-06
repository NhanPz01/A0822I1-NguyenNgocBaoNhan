package model;

import util.ConstantUtil.Gender;
import util.ConstantUtil.Level;
import util.ConstantUtil.Role;

public class Employee extends Person {
    private int employeeId;
    private Level level;
    private Role role;
    private double salary;

    public Employee() {
    }

    public Employee(int employeeId, String fullName, String dateOfBirth, Gender gender, String personId, String phoneNumber, String email, Level level, Role role, double salary) {
        super(fullName, dateOfBirth, gender, personId, phoneNumber, email);
        this.employeeId = employeeId;
        this.level = level;
        this.role = role;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s", this.employeeId, super.toString(), this.level.name(), this.role.name(), this.salary);
    }
}

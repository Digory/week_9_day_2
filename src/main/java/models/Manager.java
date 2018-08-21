package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="managers")
public class Manager extends Employee {


    private double budget;


    public Manager() {
    }

    public Manager(String firstName, String lastName, int salary, Department department, double budget) {
        super(firstName, lastName, salary, department);
        this.budget = budget;
    }




    @Column(name="budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String toString(){
        return "Manager: " + super.getFirstName() + " " + super.getLastName() + " earns: " + super.getSalary() + ", works in: " + super.getDepartment().getTitle() + " with a budget of: £" + getBudget();
    }
}


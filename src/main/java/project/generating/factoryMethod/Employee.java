package project.generating.factoryMethod;

import project.generating.residents.Human;

import java.util.Objects;


public class Employee extends Human implements IHuman{
    private String workPlace;

    public Employee(String firstName, String lastName, int age, String placeOfWork) {
        super(firstName, lastName, age);
        this.workPlace = placeOfWork;
    }

    public Employee() {
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public String goHome() {
        return "I am going home from work";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(workPlace, employee.workPlace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), workPlace);
    }
}

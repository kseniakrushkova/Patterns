package project.structural.object;

import java.util.Objects;

public class Humane {
    private String firstName;
    private String lastName;
    private String patronymicName;

    public Humane(String firstName, String lastName, String patronymicName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymicName = patronymicName;
    }
    public  Humane(){
        this("firstName", "lastName","patronymicMame");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymicName() {
        return patronymicName;
    }

    public void setPatronymicName(String patronymicName) {
        this.patronymicName = patronymicName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Humane humane = (Humane) o;
        return Objects.equals(firstName, humane.firstName) &&
                Objects.equals(lastName, humane.lastName) &&
                Objects.equals(patronymicName, humane.patronymicName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, patronymicName);
    }

    @Override
    public String toString() {
        return "Humane{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymicName='" + patronymicName + '\'' +
                '}';
    }
}

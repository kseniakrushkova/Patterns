package project.factoryMethod;

import project.city.residents.Human;

import java.util.Objects;


public class Student  extends Human implements IHuman {
    private String nameOfTheUniversity;
    private int grade;


    public Student(String firstName, String lastName, int age, String nameOfTheUniversity, int grade) {
        super(firstName, lastName, age);
        this.nameOfTheUniversity = nameOfTheUniversity;
        this.grade = grade;
    }

    public Student() {
        super();
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }

    public void setNameOfTheUniversity(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String goHome() {
        return "I am going home from university";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return grade == student.grade &&
                Objects.equals(nameOfTheUniversity, student.nameOfTheUniversity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nameOfTheUniversity, grade);
    }
}

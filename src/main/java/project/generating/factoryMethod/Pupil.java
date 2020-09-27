package project.generating.factoryMethod;

import project.generating.residents.Human;

import java.util.Objects;

public class Pupil extends Human implements IHuman {
    private String schoolName;
    private int form;

    public Pupil() {
    }

    public Pupil(String firstName, String lastName, int age, String schoolName, int form) {
        super(firstName, lastName, age);
        this.schoolName = schoolName;
        this.form = form;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getForm() {
        return form;
    }

    public void setForm(int form) {
        this.form = form;
    }

    @Override
    public String  goHome() {
        return "I am going home from school";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pupil pupil = (Pupil) o;
        return form == pupil.form &&
                Objects.equals(schoolName, pupil.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schoolName, form);
    }
}

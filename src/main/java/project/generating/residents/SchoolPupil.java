package project.generating.residents;

import java.util.Objects;

public class SchoolPupil  extends Human{
    private String schoolName;
    private int form;

    public SchoolPupil(String firstName, String lastName, int age, String schoolName, int form) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SchoolPupil that = (SchoolPupil) o;
        return form == that.form &&
                Objects.equals(schoolName, that.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schoolName, form);
    }
}

package project.structural.object;

import java.util.Objects;

public class Pupil extends Humane {
    private String schoolName;
    private int rating;
    private  int grade;

    public Pupil(String firstName, String lastName, String patronymicName, String schoolName, int rating, int grade) {
        super(firstName, lastName, patronymicName);
        this.schoolName = schoolName;
        this.rating = rating;
        this.grade = grade;
    }

    public Pupil(String schoolName, int rating, int grade) {
        this.schoolName = schoolName;
        this.rating = rating;
        this.grade = grade;
    }
    public Pupil(){
        this("SchoolName", 5,2);
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pupil pupil = (Pupil) o;
        return rating == pupil.rating &&
                grade == pupil.grade &&
                Objects.equals(schoolName, pupil.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), schoolName, rating, grade);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "schoolName='" + schoolName + '\'' +
                ", rating=" + rating +
                ", grade=" + grade +
                '}';
    }
}

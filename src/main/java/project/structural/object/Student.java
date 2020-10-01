package project.structural.object;

import java.util.Objects;

public class Student extends Humane {
    private String universityName;
    private int rating;
    private  int course;

    public Student(String firstName, String lastName, String patronymicName, String universityName, int rating, int course) {
        super(firstName, lastName, patronymicName);
        this.universityName = universityName;
        this.rating = rating;
        this.course = course;
    }

    public Student(String universityName, int rating, int course) {
        this.universityName = universityName;
        this.rating = rating;
        this.course = course;
    }
    public Student(){
        this("universityNAme",4,4);
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return rating == student.rating &&
                course == student.course &&
                Objects.equals(universityName, student.universityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), universityName, rating, course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "universityName='" + universityName + '\'' +
                ", rating=" + rating +
                ", course=" + course +
                '}';
    }
}

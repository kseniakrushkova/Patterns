package project.generating.prototype;

public class StudentFactory {
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentFactory(Student student) {
        this.student = student;
    }
     public Student clonStudent(){
        return (Student) student.clone();
    }

}

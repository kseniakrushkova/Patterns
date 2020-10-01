package project.structural.adapter;

import project.structural.object.Student;

public class StudentImpl  {
    private Student student =new Student();
    public String getFIO(){
        return  student.getFirstName()+" "+student.getLastName()+" "+student.getPatronymicName();
    }
    public String getUniversity(){
        return student.getUniversityName();
    }
    public  int getStudentRating(){
        return student.getRating();
    }
    public int getCourse(){
        return student.getCourse();
    }
}

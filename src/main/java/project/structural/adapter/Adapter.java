package project.structural.adapter;

public class Adapter extends StudentImpl implements Profile {
    private StudentImpl student = new StudentImpl();

    @Override
    public String getFullName() {
        return student.getFIO();
    }

    @Override
    public String getPlaceOfStudy() {
        return student.getUniversity();
    }

    @Override
    public int getRating() {
        return student.getStudentRating();
    }

    @Override
    public int getAchievement() {
        return student.getCourse();
    }
}

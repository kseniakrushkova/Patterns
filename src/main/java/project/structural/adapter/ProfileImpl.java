package project.structural.adapter;

import project.structural.object.Pupil;

public class ProfileImpl implements Profile{
     private Pupil pupil ;

    @Override
    public String getFullName() {
        return pupil.getFirstName()+" "+pupil.getLastName()+" "+pupil.getPatronymicName();
    }

    @Override
    public String getPlaceOfStudy() {
        return pupil.getSchoolName();
    }

    @Override
    public int getRating() {
        return pupil.getRating();
    }

    @Override
    public int getAchievement() {
        return pupil.getGrade();
    }
}

package project.structural.facade;

public class Student extends project.structural.object.Student {
    public  String doExercise(ExerciseTracker exerciseTracker){
        if(exerciseTracker.isDoExercise()){
           return "Student do exercise";
        }else {
            return "Student finish exercise";
        }
    }
}

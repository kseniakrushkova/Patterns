package project.structural.facade;

public class Work {
    Student student = new Student();
    ExerciseTracker exerciseTracker = new ExerciseTracker();
    Study study = new Study();

    public String StartProcess() {
        exerciseTracker.startDoExercise();
        return study.doExercise() + " start" + " " + student.doExercise(exerciseTracker);
    }
}

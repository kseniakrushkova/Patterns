package project.behavioral.chainOfResponsibility;

public class ProgramChecker extends Checker {
    public ProgramChecker(Priority priority) {
        super(priority);
    }

    @Override
    public String write(String massage) {
        return "problem with program - " + massage;
    }
}

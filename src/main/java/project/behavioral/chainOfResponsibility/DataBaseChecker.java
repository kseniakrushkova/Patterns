package project.behavioral.chainOfResponsibility;

public class DataBaseChecker extends Checker {
    public DataBaseChecker(Priority priority) {
        super(priority);
    }

    @Override
    public String write(String massage) {
        return "problem with database - " + massage;
    }
}

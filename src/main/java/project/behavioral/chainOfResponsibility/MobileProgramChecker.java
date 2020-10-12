package project.behavioral.chainOfResponsibility;

public class MobileProgramChecker extends Checker {
    public MobileProgramChecker(Priority priority) {
        super(priority);
    }

    @Override
    public String write(String massage) {
        return   massage;
    }
}

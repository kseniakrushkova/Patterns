package project.behavioral.state;

public class TakeBook implements PossibleActions {
    @Override
    public String doPossibleAction() {
        return "Librarian accept book";
    }
}

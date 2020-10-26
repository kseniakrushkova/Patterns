package project.behavioral.state;

public class GiveBookAway implements PossibleActions{
    @Override
    public String doPossibleAction() {
        return "Librarian handed give book away";
    }
}

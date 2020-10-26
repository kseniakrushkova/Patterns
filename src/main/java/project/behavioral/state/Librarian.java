package project.behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private PossibleActions possibleActions;
    private List<String> state = new ArrayList<>();

    public void setPossibleActions(PossibleActions possibleActions) {
        this.possibleActions = possibleActions;
    }

    public void changePossibleActions() {
        if (this.possibleActions instanceof SortingBooks) {
            TakeBook takeBook = new TakeBook();
            state.add(takeBook.doPossibleAction());
            setPossibleActions(takeBook);
        } else if (this.possibleActions instanceof TakeBook) {
            GiveBookAway giveBookAway = new GiveBookAway();
            state.add(giveBookAway.doPossibleAction());
            setPossibleActions(giveBookAway);
        } else if (this.possibleActions instanceof GiveBookAway) {
            SortingBooks sortingBooks = new SortingBooks();
            state.add(sortingBooks.doPossibleAction());
            setPossibleActions(sortingBooks);
        }
    }

    public List<String> getState() {
        return state;
    }

    public void doPossibleAction() {
         state.add(this.possibleActions.doPossibleAction());
    }
}

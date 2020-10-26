package project.behavioral.state;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestLibrarian {
    @Test
    public void testState(){
        PossibleActions possibleActions = new SortingBooks();
        Librarian librarian = new Librarian();
        librarian.setPossibleActions(possibleActions);
        librarian.doPossibleAction();
        librarian.changePossibleActions();
        librarian.changePossibleActions();
        librarian.changePossibleActions();
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected,"Librarian sort some books","Librarian accept book","Librarian handed give book away","Librarian sort some books");
        Assert.assertEquals(expected,librarian.getState());
    }
}

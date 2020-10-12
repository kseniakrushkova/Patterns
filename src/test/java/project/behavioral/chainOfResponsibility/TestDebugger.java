package project.behavioral.chainOfResponsibility;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestDebugger {
    @Test
    public void testListPriority(){
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected,"problem with database - data base work in critical mode",
                "problem with program - program work in critical mode","work in normal");
        DebuggerError debuggerError = new DebuggerError();
        Assert.assertEquals(expected, debuggerError.listPriority());
    }
}

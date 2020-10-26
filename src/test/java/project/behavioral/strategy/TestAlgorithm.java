package project.behavioral.strategy;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestAlgorithm {
    @Test
    public void testRunAlgorithmAdd(){
        Statements statement = new Statements();
        Statements statement1 = new Statements("statement",2);
        Statements statement2 = new Statements("statement",3);
        List<Statements> strings = new ArrayList<>();
        Collections.addAll(strings, statement1,statement2);
        Algorithm algorithm = new Algorithm();
        Methods method = new Add();
        algorithm.setMethod(method);
        List<Statements> expected = new ArrayList<>();
        Collections.addAll(expected,statement1,statement2,statement);
        Assert.assertEquals(expected,algorithm.runAlgorithm(strings,statement));
    }
    @Test
    public void testRunAlgorithmRemove(){
        Statements statement = new Statements();
        Statements statement1 = new Statements("statement",2);
        Statements statement2 = new Statements("statement",3);
        List<Statements> strings = new ArrayList<>();
        Collections.addAll(strings,statement, statement1,statement2);
        Algorithm algorithm = new Algorithm();
        Methods method = new Remove();
        algorithm.setMethod(method);
        List<Statements> expected = new ArrayList<>();
        Collections.addAll(expected,statement1,statement2);
        Assert.assertEquals(expected,algorithm.runAlgorithm(strings,statement));
    }
    @Test
    public void testRunAlgorithmSort(){
        Statements statement = new Statements();
        Statements statement1 = new Statements("statement",2);
        Statements statement2 = new Statements("statement",3);
        List<Statements> strings = new ArrayList<>();
        Collections.addAll(strings, statement1,statement2);
        Algorithm algorithm = new Algorithm();
        Methods method = new Sort();
        algorithm.setMethod(method);
        List<Statements> expected = new ArrayList<>();
        Collections.addAll(expected,statement,statement1,statement2);
        Assert.assertEquals(expected,algorithm.runAlgorithm(strings,statement));
    }
}

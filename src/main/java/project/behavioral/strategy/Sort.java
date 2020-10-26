package project.behavioral.strategy;

import java.util.Comparator;
import java.util.List;

public class Sort implements Methods {
    @Override
    public List<Statements> doMethod(List<Statements> strings, Statements statement) {
        strings.add(statement);
        strings.sort(Comparator.comparing(Statements::getId));
        return strings;
    }
}

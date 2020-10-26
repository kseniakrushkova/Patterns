package project.behavioral.strategy;

import java.util.List;

public class Remove implements Methods {
    @Override
    public List<Statements> doMethod(List<Statements> strings, Statements statement) {
        strings.remove(statement);
        return strings;
    }
}

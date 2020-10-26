package project.behavioral.strategy;

import java.util.List;

public class Add  implements Methods {
    @Override
    public List<Statements> doMethod(List<Statements> strings, Statements statement) {
         strings.add(statement);
         return strings;
    }
}

package project.behavioral.strategy;

import java.util.List;

public class Algorithm {
    private Methods method;

    public void setMethod(Methods method) {
        this.method = method;
    }

    public List<Statements>  runAlgorithm(List<Statements> strings, Statements statement){
        return method.doMethod(strings,statement);
    }

    @Override
    public String toString() {
        return "Algorithm{" +
                "method=" + method +
                '}';
    }
}

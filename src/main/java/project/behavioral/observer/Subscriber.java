package project.behavioral.observer;

import java.util.Set;

public class Subscriber implements Observer {
    private String FIO;

    public Subscriber(String FIO) {
        this.FIO = FIO;
    }

    @Override
    public String observations(Set<String> stringSet) {
        return FIO + "don't miss these news. They will tell us about what happened today: "+ stringSet;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "FIO='" + FIO + '\'' +
                '}';
    }
}

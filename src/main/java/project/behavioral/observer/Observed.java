package project.behavioral.observer;

import java.util.Set;

public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    Set<String> sendMassageToObserver();
}

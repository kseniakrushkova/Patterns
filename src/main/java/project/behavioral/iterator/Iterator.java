package project.behavioral.iterator;

public interface Iterator {
    boolean hasNext(int index);

    Object getNext(int index) throws IllegalAccessException;

}

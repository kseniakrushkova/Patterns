package project.behavioral.iterator;

import java.util.List;

public class IntData implements GetIterator {
    private String name;
    private List<Integer> integerList;
    private List<String> strings;

    public IntData(List<String> strings) {
        this.name = "name";
        this.strings = strings;
    }

    public IntData(String name, List<Integer> integerList) {
        this.name = name;
        this.integerList = integerList;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }


    @Override
    public Iterator getIterator() {
        return new IntIterator();
    }

    private class IntIterator implements Iterator {

        @Override
        public boolean hasNext(int index) {
            return index < integerList.size();
        }

        @Override
        public Object getNext(int index) throws IllegalAccessException {
            return integerList.get(index);
        }

    }
}

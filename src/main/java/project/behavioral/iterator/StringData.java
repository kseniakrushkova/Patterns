package project.behavioral.iterator;

import java.util.List;

public class StringData implements GetIterator{
    private String name;
    private List<String> strings;

    public StringData(String name,List<String> strings) {
        this.name = name;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }
    @Override
    public Iterator getIterator() {
        return new StringsIterator();
    }

    private class StringsIterator implements Iterator {

        @Override
        public boolean hasNext(int index) {
            return index < strings.size();
        }

        @Override
        public Object getNext(int index) throws IllegalAccessException {
            return strings.get(index);
        }

    }
}

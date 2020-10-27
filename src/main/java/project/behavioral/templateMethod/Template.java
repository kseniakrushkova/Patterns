package project.behavioral.templateMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Template {
    public List<String> cook(){
        List<String> strings = new ArrayList<>();
        strings.add("First you have to take recipe and some ingredients");
        strings.add(howCook());
        return strings;
    }
    public abstract String howCook();
}

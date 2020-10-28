package project.behavioral.visitor;

public class AssistantEngineer implements Worker {
    @Override
    public String create(Audi audi) {
        return "I am helping engineer create a new car for Audi ";
    }

    @Override
    public String create(Volkswagen volkswagen) {
        return "I am helping engineer create a new car for Volkswagen ";
    }

    @Override
    public String create(Porsche porsche) {
        return "I am helping engineer create a new car for Porsche ";
    }
}

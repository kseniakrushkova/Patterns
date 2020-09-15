package project.factoryMethod;

public class StudentFactory implements IHumanFactory {
    @Override
    public IHuman createHuman() {
        return new Student();
    }
}

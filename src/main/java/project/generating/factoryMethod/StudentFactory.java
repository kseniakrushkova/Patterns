package project.generating.factoryMethod;

public class StudentFactory implements IHumanFactory {
    @Override
    public IHuman createHuman() {
        return new Student();
    }
}

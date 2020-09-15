package project.factoryMethod;

public class EmployeeFactory implements IHumanFactory {
    @Override
    public IHuman createHuman() {
        return new Employee();
    }
}

package project.generating.factoryMethod;

public class PupilFactory implements IHumanFactory {
    @Override
    public IHuman createHuman() {
        return new Pupil();
    }
}

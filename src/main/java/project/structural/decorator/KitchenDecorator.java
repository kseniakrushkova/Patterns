package project.structural.decorator;

public class KitchenDecorator implements IDecorator {
    @Override
    public String decorate() {
        return "make new Kitchen ";
    }
}

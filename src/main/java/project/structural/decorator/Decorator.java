package project.structural.decorator;

public class Decorator implements IDecorator {
     private IDecorator decorator;

    public Decorator(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String decorate() {
        return decorator.decorate()+ "decorate";
    }
}

package project.structural.decorator;

public class MainDecorator extends  Decorator {
    public MainDecorator(IDecorator decorator) {
        super(decorator);
    }
    public String makeNewDesign(){
        return " make new design";
    }

    @Override
    public String decorate() {
        return super.decorate()+ makeNewDesign();
    }
}

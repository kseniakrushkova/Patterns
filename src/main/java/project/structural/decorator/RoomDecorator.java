package project.structural.decorator;

public class RoomDecorator extends Decorator {

    public RoomDecorator(IDecorator decorator) {
        super(decorator);
    }

    public  String makeNewDesign(){
        return " make new room design ";
    }

    @Override
    public String decorate() {
        return super.decorate() + makeNewDesign();
    }
}

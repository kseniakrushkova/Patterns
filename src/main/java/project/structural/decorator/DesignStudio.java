package project.structural.decorator;

public class DesignStudio {
    public  static String BigProject() {
         Decorator decorator = new MainDecorator(new RoomDecorator(new KitchenDecorator()));
         return decorator.decorate();
    }
    public  static String smallProject(){
        Decorator decorator = new RoomDecorator(new LivingroomDecorator());
        return  decorator.decorate();
    }
}

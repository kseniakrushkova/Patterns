package project.structural.bridge;

public class ClassicRecipe implements Instrument {
    protected Components components;

    public ClassicRecipe(Components components) {
        this.components = components;
    }

    public ClassicRecipe() {
    }

    @Override
    public String whip() {
       if(components.isContains()){
           return "This is not classic";
       }else return "This is classic";
    }

    @Override
    public String shape() {
        if(components.isContains()){
            return "shape is round";
        }else return "shape is oval";
    }

    @Override
    public String boschKitchenMachine() {
        if(components.isContains()){
            return "This is not classic";
        }else return "This is classic";
    }

    @Override
    public String toString() {
        return "ClassicRecipe{" +
                "components=" + components +
                '}';
    }
}

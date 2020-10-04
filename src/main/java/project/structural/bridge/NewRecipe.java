package project.structural.bridge;

public class NewRecipe extends  ClassicRecipe {
    public NewRecipe(Components components) {
        super(components);
    }

    public NewRecipe() {
    }

    public  String recipe(){
        return "newRecipe";
    }
//    protected Components components;
//
//    @Override
//    public String whip() {
//        if(components.isContains()){
//            return " This  is newRecipe";
//        }else return "  This  is not newRecipe ";
//    }
//
//    @Override
//    public String shape() {
//        if(components.isContains()){
//            return "shape is round";
//        }else return " shape is oval ";
//    }
//
//    @Override
//    public String boschKitchenMachine() {
//        if(components.isContains()){
//            return "This  is newRecipe";
//        }else return " This  is not newRecipe ";
//    }
}

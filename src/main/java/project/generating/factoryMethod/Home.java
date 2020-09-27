package project.generating.factoryMethod;

public class Home {
    public static IHumanFactory humanWithKeys(String who){
        if(who.equalsIgnoreCase( "pupil")){
            return new PupilFactory();
        }else
        if(who.equalsIgnoreCase("student")){
            return new StudentFactory();
        }else
        if ((who.equalsIgnoreCase("employee"))){
            return new EmployeeFactory();
        }else throw new RuntimeException( who + " can not come in home");

    }
}

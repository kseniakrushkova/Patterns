package project.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ProjectWork {
    private static final Map<String,Designer> designers = new HashMap<>();

    public Designer getDesignerForProject(String project){
        Designer designer = designers.get(project);
        if(designer == null){
            designer = new RoomDesigner();
            designers.put(project,designer);
        }
        return designer;
    }
}

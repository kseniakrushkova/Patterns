package project.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class NewProject {
    public  List<String> teemDoProject(){
        List<String> result = new ArrayList<>();
        ProjectWork projectWork = new ProjectWork();
        List<Designer> designers = new ArrayList<>();
        designers.add(projectWork.getDesignerForProject("newProject"));
        designers.add(projectWork.getDesignerForProject("newProject"));
        designers.add(projectWork.getDesignerForProject("newProject"));
        designers.add(projectWork.getDesignerForProject("newProject"));
        for(Designer designer:designers){
            result.add(designer.makeDesign());
        }
        return result;
    }
}

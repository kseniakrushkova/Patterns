package project.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class NewCar implements VolkswagenGroup {
    private VolkswagenGroup[] volkswagenGroupList;

    public NewCar() {
        this.volkswagenGroupList = new VolkswagenGroup[]{
                new Volkswagen(),
                new Audi(),
                new Porsche()
        };
    }

    @Override
    public String collect(Worker worker) {
        List<String> res= new ArrayList<>();
        for(VolkswagenGroup volkswagenGroup: volkswagenGroupList){
            res.add(volkswagenGroup.collect(worker));
        }
        return res.toString();
    }
}

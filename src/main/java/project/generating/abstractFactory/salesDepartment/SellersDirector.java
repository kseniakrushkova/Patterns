package project.generating.abstractFactory.salesDepartment;

import project.generating.abstractFactory.IDirector;

public class SellersDirector implements IDirector {
    @Override
    public String createWork() {
        return "I made a new sales plan";
    }
}

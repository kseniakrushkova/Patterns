package project.abstractFactory.salesDepartment;

import project.abstractFactory.IDirector;

public class SellersDirector implements IDirector {
    @Override
    public String createWork() {
        return "I made a new sales plan";
    }
}

package project.generating.abstractFactory.marketingDepartment;

import project.generating.abstractFactory.IDirector;

public class MarketingDirector implements IDirector {
    @Override
    public String createWork() {
        return "You need to make a new plan for selling a new product";
    }
}

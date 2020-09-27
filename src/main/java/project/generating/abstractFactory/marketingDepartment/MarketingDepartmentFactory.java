package project.generating.abstractFactory.marketingDepartment;

import project.generating.abstractFactory.IAssistant;
import project.generating.abstractFactory.IDirector;
import project.generating.abstractFactory.IEmployee;
import project.generating.abstractFactory.TeemFactory;

public class MarketingDepartmentFactory implements TeemFactory {
    @Override
    public IAssistant getAssistant() {
        return new MarketingAssistant();
    }

    @Override
    public IDirector getDirector() {
        return new MarketingDirector();
    }

    @Override
    public IEmployee getEmployee() {
        return new Marketer();
    }
}

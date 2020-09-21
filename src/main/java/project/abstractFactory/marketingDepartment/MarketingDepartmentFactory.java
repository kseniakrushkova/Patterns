package project.abstractFactory.marketingDepartment;

import project.abstractFactory.IAssistant;
import project.abstractFactory.IDirector;
import project.abstractFactory.IEmployee;
import project.abstractFactory.TeemFactory;

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

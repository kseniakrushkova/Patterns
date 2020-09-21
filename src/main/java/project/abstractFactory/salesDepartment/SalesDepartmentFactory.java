package project.abstractFactory.salesDepartment;

import project.abstractFactory.IAssistant;
import project.abstractFactory.IDirector;
import project.abstractFactory.IEmployee;
import project.abstractFactory.TeemFactory;

public class SalesDepartmentFactory implements TeemFactory {
    @Override
    public IAssistant getAssistant() {
        return new SellersAssistant();
    }

    @Override
    public IDirector getDirector() {
        return new SellersDirector();
    }

    @Override
    public IEmployee getEmployee() {
        return new Seller();
    }
}

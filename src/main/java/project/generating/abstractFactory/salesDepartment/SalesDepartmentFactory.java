package project.generating.abstractFactory.salesDepartment;

import project.generating.abstractFactory.IAssistant;
import project.generating.abstractFactory.IDirector;
import project.generating.abstractFactory.IEmployee;
import project.generating.abstractFactory.TeemFactory;

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

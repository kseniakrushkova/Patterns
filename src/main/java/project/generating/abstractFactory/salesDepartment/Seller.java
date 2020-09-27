package project.generating.abstractFactory.salesDepartment;

import project.generating.abstractFactory.IEmployee;

public class Seller implements IEmployee {
    @Override
    public String doWork() {
        return "I am selling new product";
    }
}

package project.abstractFactory.salesDepartment;

import project.abstractFactory.IEmployee;

public class Seller implements IEmployee {
    @Override
    public String doWork() {
        return "I am selling new product";
    }
}

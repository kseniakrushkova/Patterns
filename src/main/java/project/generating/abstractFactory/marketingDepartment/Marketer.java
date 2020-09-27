package project.generating.abstractFactory.marketingDepartment;

import project.generating.abstractFactory.IEmployee;

public class Marketer  implements IEmployee {
    @Override
    public String doWork() {
        return "I creat a content plan";
    }
}

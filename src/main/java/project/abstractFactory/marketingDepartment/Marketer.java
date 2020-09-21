package project.abstractFactory.marketingDepartment;

import project.abstractFactory.IEmployee;

public class Marketer  implements IEmployee {
    @Override
    public String doWork() {
        return "I creat a content plan";
    }
}

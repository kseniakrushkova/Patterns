package project.abstractFactory.salesDepartment;

import project.abstractFactory.IAssistant;

public class SellersAssistant implements IAssistant {
    @Override
    public String helpsWithWork() {
        return "I am helping you sell a new product";
    }
}

package project.generating.abstractFactory.salesDepartment;

import project.generating.abstractFactory.IAssistant;

public class SellersAssistant implements IAssistant {
    @Override
    public String helpsWithWork() {
        return "I am helping you sell a new product";
    }
}

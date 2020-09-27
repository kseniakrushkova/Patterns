package project.generating.abstractFactory.marketingDepartment;

import project.generating.abstractFactory.IAssistant;

public class MarketingAssistant  implements IAssistant {
    @Override
    public String helpsWithWork() {
        return "I help you create a content plan";
    }
}

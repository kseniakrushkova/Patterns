package project.abstractFactory.marketingDepartment;

import project.abstractFactory.IAssistant;

public class MarketingAssistant  implements IAssistant {
    @Override
    public String helpsWithWork() {
        return "I help you create a content plan";
    }
}

package project.abstractFactory;

import project.abstractFactory.marketingDepartment.Marketer;
import project.abstractFactory.marketingDepartment.MarketingAssistant;
import project.abstractFactory.marketingDepartment.MarketingDepartmentFactory;
import project.abstractFactory.marketingDepartment.MarketingDirector;
import project.abstractFactory.salesDepartment.SalesDepartmentFactory;
import project.abstractFactory.salesDepartment.Seller;
import project.abstractFactory.salesDepartment.SellersAssistant;
import project.abstractFactory.salesDepartment.SellersDirector;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class NewProduct {
    public static Set<String> marketing() {
        TeemFactory marketingDepartmentFactory = new MarketingDepartmentFactory();
        Set<String> result = new HashSet<>();
        Collections.addAll(result, marketingDepartmentFactory.getEmployee().doWork(),
                marketingDepartmentFactory.getDirector().createWork(),
                marketingDepartmentFactory.getAssistant().helpsWithWork());
        return result;
    }

    public static Set<String> sale() {
        TeemFactory marketingDepartmentFactory = new SalesDepartmentFactory();
        Set<String> result = new HashSet<>();
        Collections.addAll(result, marketingDepartmentFactory.getEmployee().doWork(),
                marketingDepartmentFactory.getDirector().createWork(),
                marketingDepartmentFactory.getAssistant().helpsWithWork());
        return result;
    }
}

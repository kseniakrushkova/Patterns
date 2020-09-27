package project.generating.abstractFactory;

import project.generating.abstractFactory.marketingDepartment.MarketingDepartmentFactory;
import project.generating.abstractFactory.salesDepartment.SalesDepartmentFactory;

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

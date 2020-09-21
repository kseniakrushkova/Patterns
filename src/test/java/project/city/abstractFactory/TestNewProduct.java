package project.city.abstractFactory;

import org.junit.Assert;
import org.junit.Test;
import project.abstractFactory.NewProduct;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TestNewProduct {
    @Test
    public void testSaleNewProduct(){
        Set<String> result = new HashSet<>();
        Collections.addAll(result, "I am helping you sell a new product", "I am selling new product",
                "I made a new sales plan");
        Assert.assertEquals(result, NewProduct.sale());
    }

    @Test
    public void testMarketingNewProduct(){
        Set<String> result = new HashSet<>();
        Collections.addAll(result, "I help you create a content plan", "I creat a content plan",
                "You need to make a new plan for selling a new product");
        Assert.assertEquals(result, NewProduct.marketing());
    }
}

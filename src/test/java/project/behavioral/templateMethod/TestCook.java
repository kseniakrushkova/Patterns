package project.behavioral.templateMethod;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCook {
    @Test
    public void testHowCookBagel(){
        Template bagel = new Bagel();
        List<String> result = new ArrayList<>();
        Collections.addAll(result,"First you have to take recipe and some ingredients",
                "Butter{grams=100, isMelted=true}CORNLiquid{liquidType=MILK, milliliters=150}Eggs{quantity=2," +
                        " isBeaten=true} mix and leave in a cold place for an hour");
        Assertions.assertAll(
                () -> Assert.assertEquals("Butter{grams=100, isMelted=true}CORNLiquid{liquidType=MILK," +
                        " milliliters=150}Eggs{quantity=2, isBeaten=true} mix and leave in a cold place for an hour",bagel.howCook()),
                () -> Assert.assertEquals(result,bagel.cook())
        );
    }
    @Test
    public void testHowCookBrioche(){
        Template brioche = new Brioche();
        List<String> result = new ArrayList<>();
        Collections.addAll(result,"First you have to take recipe and some ingredients","Eggs{quantity=2," +
                " isBeaten=true}LINOLiquid{liquidType=MILK, milliliters=150}mix and roll");
        Assertions.assertAll(
                () -> Assert.assertEquals("Eggs{quantity=2, isBeaten=true}LINOLiquid{liquidType=MILK," +
                        " milliliters=150}mix and roll",brioche.howCook()),
                () -> Assert.assertEquals(result,brioche.cook())
        );
    }
}

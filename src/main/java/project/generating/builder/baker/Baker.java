package project.generating.builder.baker;

import project.generating.builder.builders.Builder;
import project.generating.builder.components.*;

public class Baker {
    public void bakeSweet(Builder builder) {
        builder.setButter(new Butter(30, true));
        builder.setCream(new Cream(CreamType.MASCARPONE, 300));
        builder.setEggs(new Eggs(2, true));
        builder.setLiquid(new Liquid(LiquidType.MILK, 300));
        builder.setFlour(Flour.HEMP);
    }

    public void bakeNonSweet(Builder builder) {
        builder.setEggs(new Eggs(5, true));
        builder.setLiquid(new Liquid(LiquidType.WATER, 300));
        builder.setFlour(Flour.CORN);
    }

    public void bakeYeast(Builder builder) {
        builder.setButter(new Butter(80, true));
        builder.setEggs(new Eggs(1, true));
        builder.setLiquid(new Liquid(LiquidType.MILK, 300));
        builder.setFlour(Flour.LINO);
    }
}

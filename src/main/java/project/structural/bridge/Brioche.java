package project.structural.bridge;

import project.generating.builder.components.*;

public class Brioche implements Components {
    private Butter butter;
    private Cream cream;
    private Eggs eggs;
    private Flour flour;
    private Liquid liquid;


    @Override
    public void setEggs() {
        this.eggs = new Eggs(0, false);
    }

    @Override
    public void setButter() {
        this.butter = new Butter(150, true);
    }

    @Override
    public void setFlour() {
        this.flour = Flour.WHEAT;
    }

    @Override
    public void setLiquid() {
        this.liquid = new Liquid(LiquidType.MILK,100);
    }

    @Override
    public void setCream() {
        this.cream = new Cream(CreamType.CREAM_CHEESE,70);
    }

    @Override
    public boolean isContains() {
        return true;
    }
}

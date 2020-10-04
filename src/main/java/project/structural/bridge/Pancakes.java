package project.structural.bridge;

import project.generating.builder.components.*;

public class Pancakes implements Components {
    private Butter butter;
    private Cream cream;
    private Eggs eggs;
    private Flour flour;
    private Liquid liquid;


    @Override
    public void setEggs() {
        this.eggs = new Eggs(3, true);
    }

    @Override
    public void setButter() {
        this.butter = new Butter(50, true);
    }

    @Override
    public void setFlour() {
        this.flour = Flour.CORN;
    }

    @Override
    public void setLiquid() {
        this.liquid = new Liquid(LiquidType.MILK,300);
    }

    @Override
    public void setCream() {
        this.cream = new Cream(CreamType.NONE,0);
    }

    @Override
    public boolean isContains() {
        return false;
    }
}

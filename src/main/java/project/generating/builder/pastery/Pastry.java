package project.generating.builder.pastery;


import project.generating.builder.components.*;

public class Pastry {

    private Butter butter;
    private Cream cream;
    private Eggs eggs;
    private Flour flour;
    private Liquid liquid;
    private PastryType pastryType;

    public Pastry(PastryType pastryType, Butter butter, Cream cream, Eggs eggs, Flour flour, Liquid liquid) {
        this.pastryType = pastryType;
        this.butter = butter;
        this.cream = cream;
        this.eggs = eggs;
        this.flour = flour;
        this.liquid = liquid;
    }

    public Butter getButter() {
        return butter;
    }

    public void setButter(Butter butter) {
        this.butter = butter;
    }

    public Cream getCream() {
        return cream;
    }

    public void setCream(Cream cream) {
        this.cream = cream;
    }

    public Eggs getEggs() {
        return eggs;
    }

    public void setEggs(Eggs eggs) {
        this.eggs = eggs;
    }

    public Flour getFlour() {
        return flour;
    }

    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    public Liquid getLiquid() {
        return liquid;
    }

    public void setLiquid(Liquid liquid) {
        this.liquid = liquid;
    }

    public PastryType getPastryType() {
        return pastryType;
    }

    public void setPastryType(PastryType pastryType) {
        this.pastryType = pastryType;
    }
}

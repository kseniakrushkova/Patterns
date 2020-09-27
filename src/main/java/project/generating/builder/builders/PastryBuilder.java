package project.generating.builder.builders;


import project.generating.builder.components.*;
import project.generating.builder.pastery.Pastry;
import project.generating.builder.pastery.PastryType;

public class PastryBuilder implements Builder {

    private Butter butter;
    private Cream cream;
    private Eggs eggs;
    private Flour flour;
    private Liquid liquid;
    private PastryType pastryType;

    @Override
    public void setType(PastryType pastryType) {
        this.pastryType = pastryType;
    }

    @Override
    public void setEggs(Eggs eggs) {
        this.eggs = eggs;
    }

    @Override
    public void setButter(Butter butter) {
        this.butter = butter;
    }

    @Override
    public void setFlour(Flour flour) {
        this.flour = flour;
    }

    @Override
    public void setLiquid(Liquid liquid) {
        this.liquid = liquid;
    }

    @Override
    public void setCream(Cream cream) {
        this.cream = cream;
    }

    public Pastry getPastry() {
        return new Pastry(pastryType, butter, cream, eggs, flour, liquid);
    }
}

package project.behavioral.templateMethod;

import project.generating.builder.components.Butter;
import project.generating.builder.components.Eggs;
import project.generating.builder.components.Flour;
import project.generating.builder.components.Liquid;

import java.util.Objects;

public class Bagel extends Template {
    private Eggs eggs;
    private Flour flour;
    private Liquid liquid;
    private Butter butter;

    public Bagel(Eggs eggs, Flour flour, Liquid liquid, Butter butter) {
        this.eggs = eggs;
        this.flour = flour;
        this.liquid = liquid;
        this.butter = butter;
    }
    public Bagel() {
        this.eggs = new Eggs();
        this.flour = Flour.CORN;
        this.liquid = new Liquid();
        this.butter = new Butter();
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

    public Butter getButter() {
        return butter;
    }

    public void setButter(Butter butter) {
        this.butter = butter;
    }

    @Override
    public String howCook() {
        return butter.toString()+flour.name()+liquid.toString()+eggs.toString()+" mix and leave in a cold place for an hour";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bagel bagel = (Bagel) o;
        return Objects.equals(eggs, bagel.eggs) &&
                flour == bagel.flour &&
                Objects.equals(liquid, bagel.liquid) &&
                Objects.equals(butter, bagel.butter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eggs, flour, liquid, butter);
    }

    @Override
    public String toString() {
        return "Bagel{" +
                "eggs=" + eggs +
                ", flour=" + flour +
                ", liquid=" + liquid +
                ", butter=" + butter +
                '}';
    }
}

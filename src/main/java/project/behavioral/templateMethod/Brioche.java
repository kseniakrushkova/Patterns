package project.behavioral.templateMethod;

import project.generating.builder.components.Eggs;
import project.generating.builder.components.Flour;
import project.generating.builder.components.Liquid;

import java.util.Objects;

public class Brioche extends Template {

    private Eggs eggs;
    private Flour flour;
    private Liquid liquid;

    public Brioche(Eggs eggs, Flour flour, Liquid liquid) {
        this.eggs = eggs;
        this.flour = flour;
        this.liquid = liquid;
    }
    public Brioche() {
        this.eggs = new Eggs();
        this.flour = Flour.LINO;
        this.liquid = new Liquid();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brioche brioche = (Brioche) o;
        return Objects.equals(eggs, brioche.eggs) &&
                flour == brioche.flour &&
                Objects.equals(liquid, brioche.liquid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eggs, flour, liquid);
    }

    @Override
    public String toString() {
        return "Brioche{" +
                "eggs=" + eggs +
                ", flour=" + flour +
                ", liquid=" + liquid +
                '}';
    }

    @Override
    public String howCook() {
        return eggs.toString()+flour.name()+liquid.toString()+"mix and roll";
    }
}

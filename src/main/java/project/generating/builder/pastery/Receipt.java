package project.generating.builder.pastery;

import project.generating.builder.components.*;

public class Receipt {

    private final Butter butter;
    private final Cream cream;
    private final Eggs eggs;
    private final Flour flour;
    private final Liquid liquid;
    private final PastryType pastryType;

    public Receipt(Butter butter, Cream cream, Eggs eggs, Flour flour, Liquid liquid, PastryType pastryType) {
        this.butter = butter;
        this.cream = cream;
        this.eggs = eggs;
        this.flour = flour;
        this.liquid = liquid;
        this.pastryType = pastryType;
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "butter=" + butter +
                ", cream=" + cream +
                ", eggs=" + eggs +
                ", flour=" + flour +
                ", liquid=" + liquid +
                ", pastryType=" + pastryType +
                '}';
    }
}

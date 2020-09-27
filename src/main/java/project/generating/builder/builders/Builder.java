package project.generating.builder.builders;


import project.generating.builder.components.*;
import project.generating.builder.pastery.PastryType;

public interface Builder {
    void setType(PastryType pastryType);
    void setEggs(Eggs eggs);
    void setButter(Butter butter);
    void setFlour(Flour flour);
    void setLiquid(Liquid liquid);
    void setCream(Cream cream);
}

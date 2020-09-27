package project.generating.builder.components;

public class Liquid {
    private LiquidType liquidType;
    private int milliliters;

    public Liquid(LiquidType liquidType, int milliliters) {
        this.liquidType = liquidType;
        this.milliliters = milliliters;
    }

    public LiquidType getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(LiquidType liquidType) {
        this.liquidType = liquidType;
    }

    public int getMilliliters() {
        return milliliters;
    }

    public void setMilliliters(int milliliters) {
        this.milliliters = milliliters;
    }

    @Override
    public String toString() {
        return "Liquid{" +
                "liquidType=" + liquidType +
                ", milliliters=" + milliliters +
                '}';
    }
}

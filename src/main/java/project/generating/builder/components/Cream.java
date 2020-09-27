package project.generating.builder.components;

public class Cream {
    private CreamType creamType;
    private int grams;

    public Cream(CreamType creamType, int grams) {
        this.creamType = creamType;
        this.grams = grams;
    }

    public CreamType getCreamType() {
        return creamType;
    }

    public void setCreamType(CreamType creamType) {
        this.creamType = creamType;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    @Override
    public String toString() {
        return "Cream{" +
                "creamType=" + creamType +
                ", grams=" + grams +
                '}';
    }
}

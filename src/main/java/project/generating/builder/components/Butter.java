package project.generating.builder.components;

public class Butter {
    private int grams;
    private boolean isMelted;

    public Butter(int grams, boolean isMelted) {
        this.grams = grams;
        this.isMelted = isMelted;
    }
    public Butter() {
        this.grams = 100;
        this.isMelted = true;
    }

    public int getGrams() {
        return grams;
    }

    public void setGrams(int grams) {
        this.grams = grams;
    }

    public boolean isMelted() {
        return isMelted;
    }

    public void setMelted(boolean melted) {
        isMelted = melted;
    }

    @Override
    public String toString() {
        return "Butter{" +
                "grams=" + grams +
                ", isMelted=" + isMelted +
                '}';
    }
}

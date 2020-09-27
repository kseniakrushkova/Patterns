package project.generating.builder.components;

public class Eggs {
    private int quantity;
    private boolean isBeaten;

    public Eggs(int quantity, boolean isBeaten) {
        this.quantity = quantity;
        this.isBeaten = isBeaten;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBeaten() {
        return isBeaten;
    }

    public void setBeaten(boolean beaten) {
        isBeaten = beaten;
    }

    @Override
    public String toString() {
        return "Eggs{" +
                "quantity=" + quantity +
                ", isBeaten=" + isBeaten +
                '}';
    }
}

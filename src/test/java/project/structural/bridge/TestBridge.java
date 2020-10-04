package project.structural.bridge;

import org.junit.Assert;
import org.junit.Test;

public class TestBridge {
    private Components brioche = new Brioche();
    private Components pancakes = new Pancakes();

    @Test
    public void testBrioche() {
        NewRecipe newRecipe = new NewRecipe(brioche);
        Assert.assertEquals("This is not classic", newRecipe.boschKitchenMachine());
        Assert.assertEquals("shape is round", newRecipe.shape());
        Assert.assertEquals("This is not classic", newRecipe.whip());
        Assert.assertEquals("newRecipe", newRecipe.recipe());
    }

    @Test
    public void testPancakes() {
        ClassicRecipe classicRecipe = new ClassicRecipe(pancakes);
        Assert.assertEquals("This is classic", classicRecipe.boschKitchenMachine());
        Assert.assertEquals("shape is oval", classicRecipe.shape());
        Assert.assertEquals("This is classic", classicRecipe.whip());
    }
}

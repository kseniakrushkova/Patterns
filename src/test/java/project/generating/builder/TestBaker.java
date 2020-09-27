package project.generating.builder;

import org.junit.Assert;
import org.junit.Test;
import project.generating.builder.baker.Baker;
import project.generating.builder.builders.PastryBuilder;
import project.generating.builder.builders.ReceiptBuilder;
import project.generating.builder.components.CreamType;
import project.generating.builder.components.Flour;
import project.generating.builder.components.LiquidType;
import project.generating.builder.pastery.Pastry;

public class TestBaker {
    @Test
    public void testBaker1() {
        Baker baker = new Baker();
        PastryBuilder pastryBuilder = new PastryBuilder();
        baker.bakeYeast(pastryBuilder);
        Pastry pastry = pastryBuilder.getPastry();
        Assert.assertEquals("Butter{grams=80, isMelted=true}",pastry.getButter().toString());
        Assert.assertEquals(80,pastry.getButter().getGrams());
        Assert.assertTrue(pastry.getButter().isMelted());
        Assert.assertEquals("Eggs{quantity=1, isBeaten=true}",pastry.getEggs().toString());
        Assert.assertEquals(1,pastry.getEggs().getQuantity());
        Assert.assertTrue(pastry.getEggs().isBeaten());
        Assert.assertEquals(Flour.LINO,pastry.getFlour());
        Assert.assertEquals("Liquid{liquidType=MILK, milliliters=300}",pastry.getLiquid().toString());
        Assert.assertEquals(LiquidType.MILK,pastry.getLiquid().getLiquidType());
        Assert.assertEquals(300,pastry.getLiquid().getMilliliters());
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        baker.bakeYeast(receiptBuilder);
        Assert.assertEquals("Receipt{butter=Butter{grams=80, isMelted=true}, " +
                "cream=null, eggs=Eggs{quantity=1, isBeaten=true}, " +
                "flour=LINO, liquid=Liquid{liquidType=MILK, milliliters=300}, " +
                "pastryType=null}",receiptBuilder.getReceipt().toString());
    }
    @Test
    public void testBaker2() {
        Baker baker = new Baker();
        PastryBuilder pastryBuilder = new PastryBuilder();
        baker.bakeNonSweet(pastryBuilder);
        Pastry pastry = pastryBuilder.getPastry();
        Assert.assertEquals("Eggs{quantity=5, isBeaten=true}",pastry.getEggs().toString());
        Assert.assertEquals(5,pastry.getEggs().getQuantity());
        Assert.assertTrue(pastry.getEggs().isBeaten());
        Assert.assertEquals(Flour.CORN,pastry.getFlour());
        Assert.assertEquals("Liquid{liquidType=WATER, milliliters=300}",pastry.getLiquid().toString());
        Assert.assertEquals(300,pastry.getLiquid().getMilliliters());
        Assert.assertEquals(LiquidType.WATER,pastry.getLiquid().getLiquidType());
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        baker.bakeNonSweet(receiptBuilder);
        Assert.assertEquals("Receipt{butter=null, cream=null, eggs=Eggs{quantity=5, isBeaten=true}, " +
                "flour=CORN, liquid=Liquid{liquidType=WATER, milliliters=300}, pastryType=null}",
                receiptBuilder.getReceipt().toString());
    }
    @Test
    public void testBaker3() {Baker baker = new Baker();
        PastryBuilder pastryBuilder = new PastryBuilder();
        baker.bakeSweet(pastryBuilder);

        Pastry pastry = pastryBuilder.getPastry();

        Assert.assertEquals("Butter{grams=30, isMelted=true}",pastry.getButter().toString());
        Assert.assertEquals(30,pastry.getButter().getGrams());
        Assert.assertTrue(pastry.getButter().isMelted());
        Assert.assertEquals("Cream{creamType=MASCARPONE, grams=300}",pastry.getCream().toString());
        Assert.assertEquals(CreamType.MASCARPONE,pastry.getCream().getCreamType());
        Assert.assertEquals(300,pastry.getCream().getGrams());
        Assert.assertEquals("Eggs{quantity=2, isBeaten=true}",pastry.getEggs().toString());
        Assert.assertEquals(2,pastry.getEggs().getQuantity());
        Assert.assertTrue(pastry.getEggs().isBeaten());
        Assert.assertEquals(Flour.HEMP,pastry.getFlour());
        Assert.assertEquals("Liquid{liquidType=MILK, milliliters=300}",pastry.getLiquid().toString());
        Assert.assertEquals(300,pastry.getLiquid().getMilliliters());
        Assert.assertEquals(LiquidType.MILK,pastry.getLiquid().getLiquidType());
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        baker.bakeSweet(receiptBuilder);
        Assert.assertEquals("Receipt{butter=Butter{grams=30, isMelted=true}, cream=Cream{creamType=MASCARPONE," +
                        " grams=300}, eggs=Eggs{quantity=2, isBeaten=true}, flour=HEMP, liquid=Liquid{liquidType=MILK, " +
                        "milliliters=300}, pastryType=null}", receiptBuilder.getReceipt().toString());
    }
}

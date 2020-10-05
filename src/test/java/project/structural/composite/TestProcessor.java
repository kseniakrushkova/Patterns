package project.structural.composite;

import org.junit.Assert;
import org.junit.Test;

public class TestProcessor {
    @Test
    public void testBaseProcessor(){
        BaseProcessor baseProcessor = new BaseProcessor();
        baseProcessor.countElem(5);
       Assert.assertEquals("Core", baseProcessor.getCore());
       Assert.assertEquals(7, baseProcessor.getHeight());
       Assert.assertEquals(5, baseProcessor.getWidth());
    }
    @Test
    public void testBaseProcessor1(){
        BaseProcessor baseProcessor = new BaseProcessor(6);
        baseProcessor.countElem(5);
        Assert.assertEquals("Core", baseProcessor.getCore());
        Assert.assertEquals(6, baseProcessor.getHeight());
        Assert.assertEquals(5, baseProcessor.getWidth());
    }
    @Test
    public void testBaseProcessor2(){
        BaseProcessor baseProcessor = new BaseProcessor("AMD",8,10,10);
        baseProcessor.countElem(5);
        Assert.assertEquals("AMD", baseProcessor.getCore());
        Assert.assertEquals(10, baseProcessor.getHeight());
        Assert.assertEquals(10, baseProcessor.getWidth());
    }
    @Test
    public void testPhoneProcessor(){
        PhoneProcessor phoneProcessor = new PhoneProcessor();
        Assert.assertEquals("phoneType",phoneProcessor.getPhoneType());
        Assert.assertEquals("Core",phoneProcessor.getCore());
        phoneProcessor.setCore("Mediatek");
        Assert.assertEquals("Mediatek",phoneProcessor.getCore());
        Assert.assertEquals(3,phoneProcessor.getHeight());
        Assert.assertEquals(3,phoneProcessor.getWidth());
    }
    @Test
    public void testPhoneProcessor1(){
        PhoneProcessor phoneProcessor = new PhoneProcessor("newType");
        Assert.assertEquals("newType",phoneProcessor.getPhoneType());
        Assert.assertEquals("Core",phoneProcessor.getCore());
        Assert.assertEquals(3,phoneProcessor.getHeight());
        Assert.assertEquals(3,phoneProcessor.getWidth());
    }
  @Test
    public void testIntelProcessor(){
        IntelProcessor intelProcessor = new IntelProcessor();
        Assert.assertEquals("Intel", intelProcessor.getCore());
        Assert.assertEquals("name", intelProcessor.getName());
        Assert.assertEquals(5, intelProcessor.getHeight());
        Assert.assertEquals(4, intelProcessor.getWidth());

  }
    @Test
    public void testIntelProcessor1(){
        IntelProcessor intelProcessor = new IntelProcessor("IntelI7");
        Assert.assertEquals("Intel", intelProcessor.getCore());
        Assert.assertEquals("IntelI7", intelProcessor.getName());
        Assert.assertEquals(5, intelProcessor.getHeight());
        Assert.assertEquals(4, intelProcessor.getWidth());

    }
}

package project.structural.adapter;

import org.junit.Assert;
import org.junit.Test;

public class TestAdapter {
    @Test
    public void testAdapter(){
        Adapter adapter = new Adapter();
        Assert.assertEquals(4,adapter.getAchievement());
        Assert.assertEquals("firstName lastName patronymicMame",adapter.getFullName());
        Assert.assertEquals("universityNAme",adapter.getPlaceOfStudy());
        Assert.assertEquals(4,adapter.getRating());

    }
}

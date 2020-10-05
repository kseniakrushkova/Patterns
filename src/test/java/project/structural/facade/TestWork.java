package project.structural.facade;

import org.junit.Assert;
import org.junit.Test;

public class TestWork {
    @Test
    public void testStartWork(){
        Work work = new Work();
        Assert.assertEquals("do exercise start Student do exercise", work.StartProcess());
    }

}

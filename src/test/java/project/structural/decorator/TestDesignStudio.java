package project.structural.decorator;

import org.junit.Assert;
import org.junit.Test;

public class TestDesignStudio {
    @Test
    public void testBigProject(){
        Assert.assertEquals("make new Kitchen decorate make new room design decorate make new design",
                DesignStudio.BigProject());
    }
    @Test
    public void testSmallProject(){
        Assert.assertEquals("decorate living room decorate make new room design ",DesignStudio.smallProject() );
    }
}

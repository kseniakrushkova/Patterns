package project.generating.singelton;

import org.junit.Assert;
import org.junit.Test;
import project.generating.singleton.SchoolTest;

public class TestSchoolTest {
    @Test
    public  void test(){
        SchoolTest schoolTest1 = SchoolTest.getTest("Math history",4.5);
        Assert.assertEquals("SchoolTest{name='Math history', mark=4.5}",schoolTest1.toString());
        SchoolTest schoolTest2 = SchoolTest.getTest("Algebra and geometry",4.8);
        Assert.assertEquals("SchoolTest{name='Math history', mark=4.5}",schoolTest2.toString());
        SchoolTest schoolTest3 = SchoolTest.getTest("Math logic",4.4);
        Assert.assertEquals("SchoolTest{name='Math history', mark=4.5}",schoolTest3.toString());
    }
}

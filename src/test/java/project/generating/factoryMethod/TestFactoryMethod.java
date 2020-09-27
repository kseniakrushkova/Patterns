package project.generating.factoryMethod;

import org.junit.Assert;
import org.junit.Test;

public class TestFactoryMethod {
    @Test(expected = RuntimeException.class)
    public void testFactoryUnknown(){
        IHumanFactory humanFactory = Home.humanWithKeys("child");
        IHuman human = humanFactory.createHuman();
        human.goHome();
    }
    @Test
    public void testFactoryPupil1(){
        IHumanFactory humanFactory = Home.humanWithKeys("pupil");
        IHuman human = humanFactory.createHuman();
        Assert.assertEquals("I am going home from school",human.goHome());
    }
    @Test
    public void testFactoryPupil2(){
        IHumanFactory humanFactory = Home.humanWithKeys("Pupil");
        IHuman human = humanFactory.createHuman();
        Assert.assertEquals("I am going home from school",human.goHome());
    }
    @Test
    public void testFactoryStudent1(){
        IHumanFactory humanFactory = Home.humanWithKeys("student");
        IHuman human = humanFactory.createHuman();
        Assert.assertEquals("I am going home from university",human.goHome());
    }
    @Test
    public void testFactoryStudent2(){
        IHumanFactory humanFactory = Home.humanWithKeys("Student");
        IHuman human = humanFactory.createHuman();
        Assert.assertEquals("I am going home from university",human.goHome());
    }
    @Test
    public void testFactoryEmployee1(){
        IHumanFactory humanFactory = Home.humanWithKeys("employee");
        IHuman human = humanFactory.createHuman();
        Assert.assertEquals("I am going home from work",human.goHome());
    }
    @Test
    public void testFactoryEmployee2(){
        IHumanFactory humanFactory = Home.humanWithKeys("Employee");
        IHuman human = humanFactory.createHuman();
        Assert.assertEquals("I am going home from work",human.goHome());
    }
}

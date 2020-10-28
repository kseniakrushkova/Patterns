package project.behavioral.visitor;

import org.junit.Assert;
import org.junit.Test;

public class TestVolkswagenGroup {
    @Test
    public void testEngineer(){
        NewCar newCar = new NewCar();
        Worker engineer = new Engineer();
        String expected = "[I create new car for Volkswagen , I create new car for Audi , I create new car for Porsche ]";
        Assert.assertEquals(expected,newCar.collect(engineer));
    }
    @Test
    public void testAssistantEngineer(){
        NewCar newCar = new NewCar();
        Worker assistantEngineer= new AssistantEngineer();
        String expected = "[I am helping engineer create a new car for Volkswagen , " +
                "I am helping engineer create a new car for Audi , I am helping engineer create a new car for Porsche ]";
        Assert.assertEquals(expected,newCar.collect(assistantEngineer));
    }
}

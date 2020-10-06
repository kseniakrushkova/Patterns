package project.structural.proxy;

import org.junit.Assert;
import org.junit.Test;
import project.structural.object.Humane;

public class TestProxy {
    @Test
    public void testDataBaseProxy1() {
        Repository repository = new Proxy(new Humane());
        Assert.assertEquals("Proxy{humane=Humane{firstName='firstName'," +
                " lastName='lastName', patronymicName='patronymicMame'}, dataBase=null}", repository.toString());
    }
    @Test
    public void testDataBaseProxy2() {
        Repository repository = new Proxy(new Humane());
        repository.save();
        Assert.assertEquals("Proxy{humane=Humane{firstName='firstName', lastName='lastName'," +
                " patronymicName='Created patronymic name'}, dataBase=DataBase{humane=Humane{firstName='firstName', " +
                "lastName='lastName', patronymicName='Created patronymic name'}}}", repository.toString());
    }
}

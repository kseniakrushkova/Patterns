package project.behavioral.mediator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStatement {

    @Test
    public void testStatement() {
        Database database = new Database();
        Developer master = new MasterDeveloper(database, "Ivan");
        Developer juniorSergei = new JuniorDeveloper(database, "Sergei");
        Developer juniorMari = new JuniorDeveloper(database, "Mari");
        database.setMaster(master);
        database.getAccessToDatabase(juniorMari);
        database.getAccessToDatabase(juniorSergei);
        database.addStatement("need add user to database", juniorMari);
        database.addStatement("need log user to database", juniorSergei);
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Sergei - junior develop request from database: need add user to database",
                "master check", "Mari - junior develop request from database: need log user to database", "master check");
        Assert.assertEquals(strings, database.getResponse());

    }
}

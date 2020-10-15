package project.behavioral.command;

import org.junit.Assert;
import org.junit.Test;

public class TestDispatcher {
    private Timetable timetable = new Timetable();
    private Dispatcher dispatcher= new Dispatcher(new CreateCommand(timetable),new DeleteCommand(timetable),
            new InsertCommand(timetable), new RemoveCommand(timetable));
    @Test
    public void testCreate(){
        Assert.assertEquals("create new timetable",dispatcher.createRunning());
    }
    @Test
    public void testDelete(){
        Assert.assertEquals("delete old timetable",dispatcher.deleteRunning());
    }
    @Test
    public void testInsert(){
        Assert.assertEquals("add a lesson to the timetable",dispatcher.insertRunning());
    }
    @Test
    public void testRemove(){
        Assert.assertEquals("remove lessons from the timetable",dispatcher.removeRunning());
    }
}

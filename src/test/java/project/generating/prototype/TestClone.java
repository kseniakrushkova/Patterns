package project.generating.prototype;

import org.junit.Assert;
import org.junit.Test;

public class TestClone {
    @Test( )
    public void testClone1() throws IllegalAccessException {
        Student student = new Student("Ivan",21,"math faculty",4);
        StudentFactory studentFactory= new StudentFactory(student);
        Student studentClone = studentFactory.clonStudent();
        Assert.assertEquals(student.getName(), studentClone.getName());
        Assert.assertEquals(student.getAge(), studentClone.getAge());
        Assert.assertEquals(student.getFaculty(), studentClone.getFaculty());
        Assert.assertEquals(student.getCourse(), studentClone.getCourse());
    }
}

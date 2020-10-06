package project.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestNewProject {
    @Test
    public void testTeemDoProject(){
        NewProject newProject = new NewProject();
        List<String> expected = new ArrayList<>();
        Collections.addAll(expected,"make room design","make room design","make room design","make room design");
       Assert.assertEquals(expected, newProject.teemDoProject());
    }
}

package project.behavioral.iterator;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListIterator {
    @Test
    public void testIntIterator() throws IllegalAccessException {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        IntData intData = new IntData("name", integerList);
        Iterator iterator = intData.getIterator();
        Assert.assertEquals(9, iterator.getNext(8));
        Assert.assertEquals(1, iterator.getNext(0));
        Assert.assertEquals(6, iterator.getNext(5));
        Assert.assertTrue(iterator.hasNext(5));
        Assert.assertTrue(iterator.hasNext(0));
    }

    @Test
    public void testStringsIterator() throws IllegalAccessException {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "1", "2", "3", "4", "5");
        StringData stringData = new StringData("name", strings);
        Iterator iterator = stringData.getIterator();
        Assert.assertEquals("5", iterator.getNext(4));
        Assert.assertEquals("1", iterator.getNext(0));
        Assert.assertEquals("4", iterator.getNext(3));
        Assert.assertTrue(iterator.hasNext(2));
        Assert.assertTrue(iterator.hasNext(0));
    }
}

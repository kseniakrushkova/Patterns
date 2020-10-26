package project.behavioral.observer;

import org.junit.Assert;
import org.junit.Test;

public class TestNews {
    @Test
    public void testSendMassage(){
        Newspaper newspaper= new Newspaper();
        newspaper.addNews("time news");
        newspaper.addNews("local news");
        Observer observer1= new Subscriber("Fio1");
        Observer observer2= new Subscriber("Fio2");
        newspaper.addObserver(observer1);
        newspaper.addObserver(observer2);
        newspaper.addNews("breaking news");
        Assert.assertEquals("Newspaper{news=[time news, local news, breaking news], " +
                "subscribers=[Subscriber{FIO='Fio2'}, Subscriber{FIO='Fio1'}]}", newspaper.toString());
        newspaper.removeNews("time news");
    }
    @Test
    public void testRemoveMassage(){
        Newspaper newspaper= new Newspaper();
        newspaper.addNews("time news");
        newspaper.addNews("local news");
        Observer observer1= new Subscriber("Fio1");
        Observer observer2= new Subscriber("Fio2");
        newspaper.addObserver(observer1);
        newspaper.addObserver(observer2);
        newspaper.addNews("breaking news");
        newspaper.removeNews("time news");
        Assert.assertEquals("Newspaper{news=[local news, breaking news], subscribers=[Subscriber{FIO='Fio2'}," +
                " Subscriber{FIO='Fio1'}]}", newspaper.toString());

    }
}

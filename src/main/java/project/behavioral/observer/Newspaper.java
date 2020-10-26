package project.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Newspaper  implements  Observed{
    private Set<String> news = new HashSet<>();
    private Set<Observer> subscribers = new HashSet<>();
    public Set<String> addNews(String news){
        this.news.add(news);
        return sendMassageToObserver();
    }
    public void removeNews(String news){
        this.news.remove(news);
    }
    @Override
    public void addObserver(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public Set<String> sendMassageToObserver() {
        Set<String> strings = new HashSet<>();
        for(Observer observer:subscribers){
            strings.add(observer.observations(this.news));
        }
        return strings;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "news=" + news +
                ", subscribers=" + subscribers +
                '}';
    }
}

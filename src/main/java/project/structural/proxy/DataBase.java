package project.structural.proxy;

import project.structural.object.Humane;

public class DataBase implements Repository {
    private Humane humane;

    public DataBase(Humane humane) {
        this.humane = humane;
        create();
    }

    public void create(){
        humane.setPatronymicName("Created patronymic name");
    }

    @Override
    public String toString() {
        return "DataBase{" +
                "humane=" + humane +
                '}';
    }

    @Override
    public Humane save() {
        return humane;
    }
}

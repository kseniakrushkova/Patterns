package project.structural.proxy;

import project.structural.object.Humane;

public class Proxy implements Repository{
    private Humane humane;
    private DataBase dataBase;

    public Proxy(Humane humane) {
        this.humane = humane;
    }

    @Override
    public String toString() {
        return "Proxy{" +
                "humane=" + humane +
                ", dataBase=" + dataBase +
                '}';
    }

    @Override
    public Humane save() {
        if (dataBase == null) {
            dataBase = new DataBase(humane);
        }
        return dataBase.save();
    }
}

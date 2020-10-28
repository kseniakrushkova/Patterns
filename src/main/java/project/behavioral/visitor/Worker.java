package project.behavioral.visitor;

public interface Worker {
    String create(Audi audi);

    String create(Volkswagen volkswagen);

    String create(Porsche porsche);
}

package project.generating.abstractFactory;

public interface TeemFactory {
    IAssistant getAssistant();
    IDirector getDirector();
    IEmployee getEmployee();
}

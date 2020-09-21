package project.abstractFactory;

public interface TeemFactory {
    IAssistant getAssistant();
    IDirector getDirector();
    IEmployee getEmployee();
}

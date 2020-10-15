package project.behavioral.command;

public class Dispatcher {
    private Command create;
    private Command delete;
    private Command insert;
    private Command remove;

    public Dispatcher(Command create, Command delete, Command insert, Command remove) {
        this.create = create;
        this.delete = delete;
        this.insert = insert;
        this.remove = remove;
    }

    public String createRunning() {
        return create.startCommand();
    }

    public String deleteRunning() {
        return delete.startCommand();
    }

    public String insertRunning() {
        return insert.startCommand();
    }

    public String removeRunning() {
        return remove.startCommand();
    }
}

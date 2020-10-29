package project.behavioral.memento;

public class Save {
    private final String version;
    private final String state;

    public Save(String version, String state) {
        this.version = version;
        this.state = state;
    }

    public String getVersion() {
        return version;
    }

    public String getState() {
        return state;
    }
}

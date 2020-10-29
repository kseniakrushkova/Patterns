package project.behavioral.memento;

public class Game {
    private  String version;
    private String state;

    public void setVersion(String version,String state){
        this.version = version;
        this.state = state;
    }

    public Save save(){
        return new Save(version,state);
    }

    public void savedGame(Save save){
        version = save.getVersion();
        state = save.getState();
    }

    @Override
    public String toString() {
        return "Game{" +
                "version='" + version + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}

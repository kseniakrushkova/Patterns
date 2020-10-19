package project.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Database implements Data {
    private Developer master;
    private List<Developer> juniors = new ArrayList<>();
    private List<String> response = new ArrayList<>();

    public Database(Developer master, List<Developer> juniors) {
        this.master = master;
        this.juniors = juniors;
    }

    public List<String> getResponse() {
        return response;
    }

    public void setResponse(List<String> response) {
        this.response = response;
    }

    public Database() {
    }

    public Developer getMaster() {
        return master;
    }

    public void setMaster(Developer master) {
        this.master = master;
    }

    public List<Developer> getJuniors() {
        return juniors;
    }

    public void setJuniors(List<Developer> juniors) {
        this.juniors = juniors;
    }

    public void getAccessToDatabase(Developer developer) {
        this.juniors.add(developer);
    }

    @Override
    public void addStatement(String statement, Developer developer) {
        for (Developer developer1 : juniors) {
            if (developer1 != developer) {
                response.add(developer1.getStatement(statement));
            }
        }
        response.add("master check");
    }
}

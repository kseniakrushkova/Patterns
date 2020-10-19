package project.behavioral.mediator;

public class JuniorDeveloper implements Developer {
    private Data data;
    private String name;

    public JuniorDeveloper(Data data, String name) {
        this.data = data;
        this.name = name;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setStatement(String statement) {
        data.addStatement(statement, this);
    }

    @Override
    public String getStatement(String statement) {
        return this.name + " - junior develop request from database: " + statement;
    }
}

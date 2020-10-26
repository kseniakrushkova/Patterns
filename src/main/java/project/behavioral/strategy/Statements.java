package project.behavioral.strategy;

import java.util.Objects;

public class Statements {
    private String statementName;
    private int id;

    public Statements(String statementName, int id) {
        this.statementName = statementName;
        this.id = id;
    }
    public Statements() {
        this.statementName = "statementName";
        this.id = 1;
    }
    public String getStatementName() {
        return statementName;
    }

    public void setStatementName(String statementName) {
        this.statementName = statementName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Statements that = (Statements) o;
        return id == that.id &&
                Objects.equals(statementName, that.statementName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statementName, id);
    }

    @Override
    public String toString() {
        return "Statements{" +
                "statementName='" + statementName + '\'' +
                ", id=" + id +
                '}';
    }
}

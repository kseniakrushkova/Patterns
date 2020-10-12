package project.behavioral.chainOfResponsibility;

public abstract class Checker {
    private Checker next;
    private Priority priority;

    public Checker(Priority priority) {
        this.priority = priority;
    }

    public void setNext(Checker next) {
        this.next = next;
    }

    public String massage(String massage, Priority priority) {
        String result = "";
        if (priority.getErrorString().equals(this.priority.getErrorString()) ) {
            result = write(massage);
        }
        if (next != null) {
            next.massage(massage, priority);
        }
        return result;
    }

    public abstract String write(String massage);

}

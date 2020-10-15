package project.behavioral.command;

public class InsertCommand implements Command {
    private Timetable timetable;

    public InsertCommand(Timetable timetable) {
        this.timetable = timetable;
    }

    @Override
    public String startCommand() {
        return timetable.insertLesson();
    }
}

package project.behavioral.command;

public class DeleteCommand implements Command {
    private Timetable timetable;

    public DeleteCommand(Timetable timetable) {
        this.timetable = timetable;
    }

    @Override
    public String startCommand() {
        return timetable.deleteTimetable();
    }
}

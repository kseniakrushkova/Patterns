package project.behavioral.command;

public class RemoveCommand implements Command {
    private Timetable timetable;

    public RemoveCommand(Timetable timetable) {
        this.timetable = timetable;
    }

    @Override
    public String startCommand() {
        return timetable.removeLesson();
    }
}

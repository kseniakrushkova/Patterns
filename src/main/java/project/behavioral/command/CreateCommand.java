package project.behavioral.command;

public class CreateCommand implements Command {
    private Timetable timetable;

    public CreateCommand(Timetable timetable) {
        this.timetable = timetable;
    }

    @Override
    public String startCommand() {
        return timetable.crateTimetable();
    }
}

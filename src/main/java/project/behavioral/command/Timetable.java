package project.behavioral.command;

public class Timetable {
    public String insertLesson() {
        return "add a lesson to the timetable";
    }

    public String removeLesson() {
        return "remove lessons from the timetable";
    }

    public String crateTimetable() {
        return "create new timetable";
    }

    public String deleteTimetable() {
        return "delete old timetable";
    }
}

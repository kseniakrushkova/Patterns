package project.behavioral.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class DebuggerError {
    public List<String> listPriority() {
        List<String> result = new ArrayList<>();
        Checker database = new DataBaseChecker(Priority.DATABASE_EXCEPTION);
        Checker program = new ProgramChecker(Priority.PROGRAM_EXCEPTION);
        Checker mobile = new MobileProgramChecker(Priority.WORK_PROPERLY);
        database.setNext(program);
        program.setNext(mobile);
        result.add(database.massage("data base work in critical mode", Priority.DATABASE_EXCEPTION));
        result.add(program.massage("program work in critical mode", Priority.PROGRAM_EXCEPTION));
        result.add(mobile.massage("work in normal", Priority.WORK_PROPERLY));
        return result;
    }
}

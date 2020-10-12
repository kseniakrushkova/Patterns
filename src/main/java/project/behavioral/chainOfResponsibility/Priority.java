package project.behavioral.chainOfResponsibility;

public enum Priority {
    DATABASE_EXCEPTION("wrong database"),
    PROGRAM_EXCEPTION("wrong program"),
    MOBILE_EXCEPTION("wrong mobile program"),
    WORK_PROPERLY( "work properly");
    private final String errorString;

    Priority(String errorString) {
        this.errorString = errorString;
    }

    public String getErrorString() {
        return errorString;
    }

}


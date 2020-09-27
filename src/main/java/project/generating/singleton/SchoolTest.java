package project.generating.singleton;

public class SchoolTest {
    private static SchoolTest test;
    public String name;
    public double mark;

    private SchoolTest (String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public static synchronized SchoolTest getTest(String name, double mark) {
        if (test == null) {
            test = new SchoolTest(name, mark);
        }
        return test;
    }

    @Override
    public String toString() {
        return "SchoolTest{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}

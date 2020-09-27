package project.generating.singleton;

public class CheckTest {
    public String check(String name, double mark){
        SchoolTest schoolTest = SchoolTest.getTest(name,mark);
        return  schoolTest.toString();
    }
}

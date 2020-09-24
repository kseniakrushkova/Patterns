package project.prototype;

public class Student  implements IClonable{
    private String name;
    private int age;
    private String faculty;
    private int course;

    public Student(String name, int age, String faculty, int course) throws IllegalAccessException {
        if (name == null || name.equals("")){
            throw new IllegalAccessException(" bad param - name is null");
        }
        if (name == null || name.equals("")){
            throw new IllegalAccessException(" bad param - faculty is null");
        }
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        if (name == null || name.equals("")){
            throw new IllegalAccessException(" bad param - name is null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) throws IllegalAccessException {
        if (faculty == null || faculty.equals("")){
            throw new IllegalAccessException(" bad param - faculty is null");
        }
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public Object clone() {
        Student student = null;
        try {
            student = new Student(name,age,faculty,course);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return student;
    }
}

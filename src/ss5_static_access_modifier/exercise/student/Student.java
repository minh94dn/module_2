package ss5_static_access_modifier.exercise.student;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    public String display(){
        return "Name: " + getName() + "\t Class: " + getClasses();
    }
}

package se.ecutb.Omar.Ali;

import java.time.LocalDate;
import java.util.List;

public class Course {
    private int id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private List<Student> students;

    public Course(int id, String courseNumber, LocalDate startDate, int weekDuration, List<Student> students) {
        this.id = id;
        this.courseName = courseNumber;
        this.startDate = startDate;
        this.weekDuration = weekDuration;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        this.weekDuration = weekDuration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void register(Student student){

    }
    public void unregister(Student student){

    }
}

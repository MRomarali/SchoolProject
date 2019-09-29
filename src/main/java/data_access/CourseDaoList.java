package data_access;

import se.ecutb.Omar.Ali.Course;

import java.time.LocalDate;
import java.util.List;

public class CourseDaoList implements CourseDao {
    private static List<Course> courses;

    @Override
    public Course saveCourse(Course course) {
        if (courses.contains(course)) {
            courses.add(course);
            System.out.println(course.getCourseName() + "Added!");
            return course;
        }
        return null;
    }

    @Override
    public Course findById(int Id) {
        for (Course course:courses) {
            if (course.getId() == Id) {
                return course;
            }
        }
        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        for (Course course:courses) {
            if (course.getCourseName().equalsIgnoreCase(name)) {
                return courses;
            }
        }
        return null;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        for (Course course:courses) {
            if (course.getStartDate().equals(date)) {
                return courses;
            }
        }
        return null;
    }

    @Override
    public List<Course> findAll() {
        for (Course course:courses) {
            return courses;
        }
        return null;
    }

    @Override
    public boolean removeCourse(Course course) {
        for (Course deleteCourse:courses) {
            if (deleteCourse.getCourseName().equals(course)) {
                courses.remove(deleteCourse);
                System.out.println(course.getCourseName() + "Deleted!");
            }
            return true;
        }
        return false;
    }
}

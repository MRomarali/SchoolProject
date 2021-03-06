package data_access;

import se.ecutb.Omar.Ali.Student;

import java.lang.reflect.Array;
import java.util.List;

public class StudentDaoList implements  StudentDao {
    private static List<Student> students;

    @Override
    public Student saveStudent(Student student) {
        students.add(student);
        if (students.contains(student)) {
            return student;
        }
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        for (Student student:students) {
            if (student.getEmail().equalsIgnoreCase(email)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findByName(String name) {
        for (Student student:students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student findById(int id) {
        for (Student student:students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findAll() {
        for (Student student:students) {
            return students;
        }
        return null;
    }

    @Override
    public boolean deleteStudent(Student student) {
        for (Student removeStudent:students) {
            if (removeStudent.getName().equals(student)) {
                students.remove(removeStudent);
            }
        }
        return false;
    }

}

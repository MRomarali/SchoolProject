package data_access;

import se.ecutb.Omar.Ali.Student;

import java.util.List;

public interface StudentDao {
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student findByName(String name);
    Student findById(int id);
    List<Student>findAll();
    boolean deleteStudent(Student student);

}

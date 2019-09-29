package se.ecutb.Omar.Ali;

import data_access.CourseDao;
import data_access.CourseDaoList;
import data_access.StudentDaoList;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Program {

    private static List<Student> students = new ArrayList<>();
    private static Course course = new Course();
    private static Student student = new Student();
    private static CourseDaoList cao = new CourseDaoList();
    private static StudentDaoList sao = new StudentDaoList();
    private static Scanner input = new Scanner(System.in);

    public static void welcome() {
            System.out.println("Welcome to school management system\n" +
                    "=====================================\n" +
                    "\t\t\t\tType\n" +
                    "1: To Create new courses and students\n" +
                    "2: To Register and remove students to/from courses\n" +
                    "3: To Find students and courses\n" +
                    "4: To Edit students and courses\n" +
                    "====================================="

            );
    }

    public static void program() {
        boolean asLongAs = true;
        int choice = 0;
        String choices = "";
        welcome();
        choice = input.nextInt();
        choices = input.nextLine();
        while (asLongAs) {
            switch (choice) {
                case 1:
                    System.out.println("press 5 to create course and 6 to create student");
                    choice = input.nextInt();
                    if (choice == 5) {
                        System.out.println("Create course\n " + "Create id");
                        course.setId(input.nextInt());
                        System.out.println("Create course name");
                        course.setCourseName(input.next());
                        System.out.println("Create startDate YYYY-MM-DD");
                        course.setStartDate(LocalDate.parse(input.next()));
                        System.out.println("Create weekDuration");
                        course.setWeekDuration(input.nextInt());
                        System.out.println("Create students");
                        course.setStudents(students);
                        System.out.println("Added " + course.toString() + "\n\n\n");
                    }
                    if (choice == 6) {
                        System.out.println("Create student\n " + "Create id");
                        student.setId(input.nextInt());
                        System.out.println("Create student name");
                        student.setName(input.next());
                        System.out.println("Create student email");
                        student.setEmail(input.next());
                        System.out.println("Create student address");
                        student.setAddress(input.next());
                        System.out.println("Added " + student.toString() + "\n\n\n");
                    }
                    welcome();
                    choice = input.nextInt();
                    break;
                case 2:
                    System.out.println("press r to register student and u to unregister");
                    choices = input.next();
                    if (choices.equals("r")) {
                        System.out.println("Register student with Email");
                        student.setEmail(input.next());
                        System.out.println(student.getEmail() + "registered");
                    }
                    if (choices.equals("u")) {
                        System.out.println("unregister student with Email");
                        choices = input.next();
                        if (choices.equals(student.getEmail())) {
                            course.unregister(student);
                        }
                        System.out.println(student.getEmail() + "unregistered");
                    }
                    welcome();
                    choice = input.nextInt();
                    break;
                case 3:
                    System.out.println("press 9 to find courses and 10 to find students");
                    choice = input.nextInt();
                    if (choice == 9) {
                        System.out.println(cao.findAll());
                        System.out.println("Search course by id");
                        choice = input.nextInt();
                        if (choice == course.getId()) {
                            System.out.println(course.toString());
                        }
                    }
                    if (choice == 10) {
                        System.out.println(sao.findAll());
                        System.out.println("Search student by id");
                        choice = input.nextInt();
                        if (choice == student.getId())
                        {
                            System.out.println(student.toString());
                        }
                    }
                    welcome();
                    choice = input.nextInt();
                    break;
                case 4:
                    System.out.println("press 11 to edit course and 12 to edit student");
                    choice = input.nextInt();
                    if (choice == 11) {
                        System.out.println("Edit course by Id");
                        choice = input.nextInt();
                        if (choice == course.getId()) {
                            System.out.println("Create course name");
                            course.setCourseName(input.next());
                            System.out.println("Create startDate YYYY-MM-DD");
                            course.setStartDate(LocalDate.parse(input.next()));
                            System.out.println("Create weekDuration");
                            course.setWeekDuration(input.nextInt());
                            System.out.println("Edited " + course.toString() + "\n\n\n");
                        }
                    }
                        if (choice == 12) {
                            System.out.println("Edit student by Id");
                            choice = input.nextInt();
                            if (choice == student.getId()) {
                                System.out.println("Create student name");
                                student.setName(input.next());
                                System.out.println("Create email");
                                student.setEmail(input.next());
                                System.out.println("Create address");
                                student.setAddress(input.next());
                                System.out.println("Edited" + student.toString() + "\n\n\n");
                            }
                        }
                        welcome();
                        choice = input.nextInt();
                        break;
                }
            }
        }
    }
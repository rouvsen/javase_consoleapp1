package bean;

import java.io.Serializable;

public class Config implements Serializable {
    private Teacher[] teachers = new Teacher[0];
    private Student[] students = new Student[0];
    private static Config config = null;
    private static boolean loggedIn;

    private Config() {
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public static void setLoggedIn(boolean loggedIn) {
        Config.loggedIn = loggedIn;
    }

    public static Config instance() {
        if (config == null) {
            config = new Config();
        }
        return config;
    }

    public void addStudent(Student s) {
        Student[] newStudentArr = new Student[students.length + 1];

        for (int i = 0; i < students.length ; i++) {
            newStudentArr[i] = students[i];
        }

        newStudentArr[newStudentArr.length - 1] = s;

        students = newStudentArr;
    }

    public void addTeacher(Teacher s) {
        Teacher[] newTeacherArr = new Teacher[teachers.length + 1];

        for (int i = 0; i < teachers.length; i++) {
            newTeacherArr[i] = teachers[i];
        }

        newTeacherArr[newTeacherArr.length - 1] = s;

        teachers = newTeacherArr;
    }
}

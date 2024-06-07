package view;

import model.Teacher;

import java.util.List;

public class TeacherView {
    public void displayTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println("Teacher ID: " + teacher.getId() + ", Name: " + teacher.getName() + ", Subject: " + teacher.getSubject());
        } else {
            System.out.println("Teacher not found.");
        }
    }

    public void displayTeachers(List<Teacher> teachers) {
        if (teachers != null && !teachers.isEmpty()) {
            for (Teacher teacher : teachers) {
                displayTeacher(teacher);
            }
        } else {
            System.out.println("No teachers available.");
        }
    }
}

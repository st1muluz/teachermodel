package controller;

import model.Teacher;
import service.TeacherService;
import view.TeacherView;

public class TeacherController {
    private TeacherService service;
    private TeacherView view;

    public TeacherController() {
        this.service = new TeacherService();
        this.view = new TeacherView();
    }

    public void createTeacher(int id, String name, String subject) {
        Teacher teacher = new Teacher(id, name, subject);
        service.addTeacher(teacher);
        System.out.println("Teacher created successfully.");
    }

    public void editTeacher(int id, String name, String subject) {
        Teacher updatedTeacher = service.updateTeacher(id, name, subject);
        if (updatedTeacher != null) {
            System.out.println("Teacher updated successfully.");
        } else {
            System.out.println("Teacher not found.");
        }
    }

    public void displayTeacher(int id) {
        Teacher teacher = service.getTeacher(id);
        view.displayTeacher(teacher);
    }

    public void displayAllTeachers() {
        view.displayTeachers(service.listTeachers());
    }
}

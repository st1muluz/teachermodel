package service;

import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService {
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public Teacher getTeacher(int teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == teacherId) {
                return teacher;
            }
        }
        return null;
    }

    public Teacher updateTeacher(int teacherId, String name, String subject) {
        Teacher teacher = getTeacher(teacherId);
        if (teacher != null) {
            if (name != null && !name.isEmpty()) {
                teacher.setName(name);
            }
            if (subject != null && !subject.isEmpty()) {
                teacher.setSubject(subject);
            }
        }
        return teacher;
    }

    public Teacher deleteTeacher(int teacherId) {
        Teacher teacher = getTeacher(teacherId);
        if (teacher != null) {
            teachers.remove(teacher);
        }
        return teacher;
    }

    public List<Teacher> listTeachers() {
        return teachers;
    }
}

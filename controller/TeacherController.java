package ru.gb.oseminar.controller;

import ru.gb.oseminar.data.Teacher;
import ru.gb.oseminar.service.StudentGroupService;
import ru.gb.oseminar.service.StudentService;
import ru.gb.oseminar.service.TeacherService;
import ru.gb.oseminar.view.StudentView;
import ru.gb.oseminar.view.TeacherViev;

import java.time.LocalDate;

public class TeacherController implements UserController<Teacher> {
    private final TeacherService dataService = new TeacherService();

    private final TeacherViev teacherViev = new TeacherViev();
    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {

    }
}

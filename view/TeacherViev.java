package ru.gb.oseminar.view;

import ru.gb.oseminar.data.Student;
import ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherViev implements UserView<Teacher>{

    Logger logger = Logger.getLogger(TeacherViev.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        for(Teacher user: teachers){
            logger.info(user.toString());
        }
    }


}

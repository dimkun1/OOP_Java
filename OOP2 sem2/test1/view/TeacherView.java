package test1.view;

import java.util.List;

import test1.data.User;

public class TeacherView extends UserView {

    @Override
    protected User userFindTheBest(List<User> userList) {
        //логика для учителя
        return null;
    }
    
}
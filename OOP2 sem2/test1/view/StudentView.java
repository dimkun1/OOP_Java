package test1.view;

import java.util.List;

import test1.data.User;

public class StudentView extends UserView {

    @Override
    protected User userFindTheBest(List<User> userList) {
        //логика для ученика
        return null;
    }
    
}
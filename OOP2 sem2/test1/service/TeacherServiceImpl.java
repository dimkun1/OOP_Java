package test1.service;

import test1.data.User;
import test1.util.ReaderFromTxt;
import test1.util.WriterToTxt;

public class TeacherServiceImpl implements DataService {
    
    @Override
    public void create(User user) {
        WriterToTxt.write(user);
        
    }

    @Override
    public User read(User user) {
        ReaderFromTxt.read(user);
        return user;
    }
}
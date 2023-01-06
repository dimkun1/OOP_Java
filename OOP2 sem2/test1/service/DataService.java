package test1.service;

import test1.data.User;
public interface DataService {
    
    void create(User user);
    User read(User user);

}
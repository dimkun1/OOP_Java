package test1.service;

import test1.data.StudentGroup;


public interface StudentGroupService {

    StudentGroup read();
    StudentGroup read(int groupNumber);
    void create (StudentGroup studentGroup);

}
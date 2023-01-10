package service;

import data.StudentGroup;


public interface StudentGroupService {

    StudentGroup read();
    StudentGroup read(int groupNumber);
    void removeStudent (String fio);
    void sortStudentYear(StudentGroup studentGroup);
    void sortStudentFio(StudentGroup studentGroup);
    void create (StudentGroup studentGroup);

}
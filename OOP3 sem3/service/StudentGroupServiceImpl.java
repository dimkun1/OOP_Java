package service;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import data.Student;
import data.StudentGroup;
import data.Teacher;
import data.UserComparator;
import util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {

    @Override
    public StudentGroup read() {
        Teacher teacher = ReaderFromTxt.readTeacher();
        List <Student> listOfStudents = ReaderFromTxt.readStudents();
        StudentGroup studentGroup = new StudentGroup (teacher, listOfStudents);
        return studentGroup;
    }

    @Override
    public StudentGroup read (int groupNumber) {
        Teacher teacher = ReaderFromTxt.readTeacher();
        List <Student> listOfStudents = ReaderFromTxt.readStudents();
        StudentGroup studentGroup = new StudentGroup (teacher, listOfStudents, groupNumber);
        return studentGroup;
    }


    @Override
    public void removeStudent(String fio) {
        Iterator <Student> studentGroup = read().iterator();
        while (studentGroup.hasNext()) {
            Student student = studentGroup.next();
            if (fio.equals(student.getFio())) {
                studentGroup.remove();
            }
        }
    }

    @Override
    public void sortStudentYear(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList());

    }

    @Override
    public void sortStudentFio(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudentList(), new UserComparator());

    }


    @Override
    public void create(StudentGroup studentGroup) {
        // Запись группы в текстовый файл
        
    }

}
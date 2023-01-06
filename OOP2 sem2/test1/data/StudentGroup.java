package test1.data;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    
    Teacher teacher;
    List <Student> listOfStudents = new ArrayList<>();
    int groupNumber;


    public StudentGroup(Teacher teacher, List<Student> listOfStudents) {
        this.teacher = teacher;
        this.listOfStudents = listOfStudents;
    }


    public StudentGroup(Teacher teacher, List<Student> listOfStudents, int groupNumber) {
        this.teacher = teacher;
        this.listOfStudents = listOfStudents;
        this.groupNumber = groupNumber;
    }


    public Teacher getTeacher() {
        return teacher;
    }
    
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
   
   
    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}

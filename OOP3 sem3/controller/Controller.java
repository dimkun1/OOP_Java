package controller;

import data.Student;
import service.DataService;
import service.StudentServiceImpl;

public class Controller {
    private DataService studentService;
    
    
    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }


    public Student createStudents(Student student) {
        studentService.create(student);
        studentService.read(student);
        return student;
    }
    
}
package test1.controller;

import test1.data.Student;
import test1.service.DataService;
import test1.service.StudentServiceImpl;

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

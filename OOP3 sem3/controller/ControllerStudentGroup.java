package controller;

import data.StudentGroup;
import service.StudentGroupService;

public class ControllerStudentGroup {
    public StudentGroupService studentGroupService;


    public ControllerStudentGroup(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public StudentGroup returnGroup (int groupNumber) {
        return studentGroupService.read(groupNumber);
    }
}
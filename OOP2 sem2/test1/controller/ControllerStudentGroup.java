package test1.controller;

import test1.data.StudentGroup;
import test1.service.StudentGroupService;

public class ControllerStudentGroup {
    public StudentGroupService studentGroupService;


    public ControllerStudentGroup(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public StudentGroup returnGroup (int groupNumber) {
        return studentGroupService.read(groupNumber);
    }
}
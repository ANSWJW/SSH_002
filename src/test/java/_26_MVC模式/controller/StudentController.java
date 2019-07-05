package _26_MVC模式.controller;

import _26_MVC模式.model.Student;
import _26_MVC模式.view.StudentView;

public class StudentController {
    private Student model;
    private StudentView view;

    public void updateView(){
        view.printStudentDetails(model.getName(),model.getRollNo());
    }

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public void setStudentRollNo(String rollNo){
        model.setRollNo(rollNo);
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }
}

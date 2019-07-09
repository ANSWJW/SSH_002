package _33_传输对象模式;

import java.util.List;

public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();
        //输出所有的学生
        for (StudentVO student : studentBusinessObject.getAllStudents()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        //更新学生
        List<StudentVO> allStudents = studentBusinessObject.getAllStudents();
        StudentVO student = allStudents.get(0);
        student.setName("Michael");
        studentBusinessObject.updateStudent(student);

        //获取学生
        StudentVO studentNew = studentBusinessObject.getStudent(0);
        System.out.println("Student: [RollNo : " + studentNew.getRollNo() + ", Name : " + studentNew.getName() + " ]");
    }
}

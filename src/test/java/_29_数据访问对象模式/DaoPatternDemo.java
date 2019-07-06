package _29_数据访问对象模式;

import _29_数据访问对象模式.api.StudentDao;
import _29_数据访问对象模式.imp.StudentDaoImp;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImp();
        
        //输出所有学生
        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "  +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        //更新学生
        Student student =studentDao.getAllStudents().get(0);
        student.setName("Michael");
        studentDao.updateStudent(student);

        //获取学生
        studentDao.getStudent(0);
        System.out.println("Student: [RollNo : "  +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}

package _29_数据访问对象模式.imp;

import _29_数据访问对象模式.Student;
import _29_数据访问对象模式.api.StudentDao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImp implements StudentDao {
    //列表是当作一个数据库
    List<Student> students;

    public StudentDaoImp( ) {
        this.students = new ArrayList<Student>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John",1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No " + student.getRollNo() +", updated in the database");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student: Roll No " + student.getRollNo() +", deleted from database");

    }
}

package _33_传输对象模式;

public class StudentVO {
    private String name;
    private int rollNo;

    StudentVO(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

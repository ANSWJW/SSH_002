package 单例模式.枚举;

/**
 * Created by WJW on 2019/6/19.
 */
public class Student {
    private long createTime;

    public Student(long createTime) {
        this.createTime = createTime;
    }

    public long getCreateTime() {
        return createTime;
    }
}

package _03_单例模式.静态内部类;

/**
 * Created by WJW on 2019/6/19.
 */
public class Test {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();

        if (instance1 == instance2) System.out.println("对象相等");
    }
}

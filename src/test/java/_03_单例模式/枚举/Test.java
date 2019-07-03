package _03_单例模式.枚举;

/**
 * Created by WJW on 2019/6/19.
 */
public class Test {
    public static void main(String[] args) {
        long begin = System.currentTimeMillis();
        Singleton instance1 = Singleton.INSTANCE01;
        Singleton instance3= Singleton.INSTANCE01;

        if (instance1 == instance3){
            System.out.println("1和3相等");
        }


        Student str1 = Singleton.INSTANCE01.getStr();
        Student str2 = Singleton.INSTANCE01.getStr();
        System.out.println(str1.getCreateTime());
        System.out.println(str2.getCreateTime());
        if (str1 == str2){
            System.out.println("1和2一样");
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时:\t"+(end - begin));
    }
}

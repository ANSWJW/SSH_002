package _28_组合实体模式;

/**
 * 粗粒度对象
 */
public class CoarseGrainedObject {
    DependentObject1 do1 = new DependentObject1();
    DependentObject2 do2 = new DependentObject2();

    public void setDate(String data1,String data2){
        do1.setData(data1);
        do2.setData(data2);
    }

    public String [] getData(){
        return new String[] {do1.getData(),do2.getData()};
    }

}

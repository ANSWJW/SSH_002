package _28_组合实体模式;

/**
 * 组合实体
 */
public class CompositeEntity {
    private CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();
    public void setData(String data1,String data2){
        coarseGrainedObject.setDate(data1,data2);
    }

    public String[] getData(){
      return  coarseGrainedObject.getData();
    }
}

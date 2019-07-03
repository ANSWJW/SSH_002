package _04_建造者模式;

import _04_建造者模式.api.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WJW on 2019/6/23.
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost (){
        float cost = 0f;
        for (Item item:items){
            cost += item.price();
        }
        return cost;
    }

    public void showItem(){
        for (Item item :  items) {
            System.out.print("Item:"+item.name());
            System.out.print(",Packing:"+item.packing().pack());
            System.out.println(",Price:"+item.price());
        }
    }
}

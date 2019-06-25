package 适配器模式.demo02.imp;

import 适配器模式.demo02.api.SDCard;
import 适配器模式.demo02.api.TFCard;

/**
 * Created by WJW on 2019/6/25.
 */
public class SDAdapterTF implements SDCard {
    TFCard tfCard;

    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card ");
        return tfCard.readTF();
    }

    @Override
    public int writeSD(String msg) {
        System.out.println("adapter write tf card");
        return tfCard.writeTF(msg);
    }
}

package 适配器模式.demo02;

import 适配器模式.demo02.api.Computer;
import 适配器模式.demo02.api.SDCard;
import 适配器模式.demo02.api.TFCard;
import 适配器模式.demo02.imp.SDAdapterTF;
import 适配器模式.demo02.imp.SDCardImp;
import 适配器模式.demo02.imp.TFCardImpl;
import 适配器模式.demo02.imp.ThinkpadComputer;

/**
 * Created by WJW on 2019/6/25.
 */
public class ComputerReadDemo {
    public static void main(String[] args) {
        Computer computer = new ThinkpadComputer();
        SDCard sdCard = new SDCardImp();
        System.out.println(computer.readSD(sdCard));

        System.out.println("====================================");

        TFCard tfCard = new TFCardImpl();
        SDCard tfCardAdapterSD = new SDAdapterTF(tfCard);
        System.out.println(computer.readSD(tfCardAdapterSD));
    }
}

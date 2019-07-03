package _06_适配器模式.demo02;

import _06_适配器模式.demo02.api.Computer;
import _06_适配器模式.demo02.api.SDCard;
import _06_适配器模式.demo02.api.TFCard;
import _06_适配器模式.demo02.imp.SDAdapterTF;
import _06_适配器模式.demo02.imp.SDCardImp;
import _06_适配器模式.demo02.imp.TFCardImpl;
import _06_适配器模式.demo02.imp.ThinkpadComputer;

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

package _14_责任链模式.imp;

import _14_责任链模式.api.AbstractLogger;

/**
 * Created by WJW on 2019/7/2.
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}

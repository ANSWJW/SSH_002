package 责任链模式.imp;

import 责任链模式.api.AbstractLogger;

/**
 * Created by WJW on 2019/7/2.
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}

package 责任链模式;

import 责任链模式.api.AbstractLogger;
import 责任链模式.imp.ConsoleLogger;
import 责任链模式.imp.ErrorLogger;
import 责任链模式.imp.FileLogger;

/**
 * Created by WJW on 2019/7/2.
 */
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }


    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is a debug level information.");
        System.out.println();
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");
    }
}

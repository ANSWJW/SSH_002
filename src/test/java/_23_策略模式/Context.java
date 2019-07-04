package _23_策略模式;

import _23_策略模式.api.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
       return  strategy.doOperation(num1,num2);
    }
}

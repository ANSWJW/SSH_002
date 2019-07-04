package _23_策略模式.imp;

import _23_策略模式.api.Strategy;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}

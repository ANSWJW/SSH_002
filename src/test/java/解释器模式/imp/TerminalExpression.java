package 解释器模式.imp;

import 解释器模式.api.Expression;

/**
 * Created by WJW on 2019/7/2.
 */
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)){
            return true;
        }
        return false;
    }
}

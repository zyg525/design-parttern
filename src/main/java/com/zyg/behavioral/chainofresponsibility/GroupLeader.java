package com.zyg.behavioral.chainofresponsibility;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:55
 * @Version: v1.0
 * @Description: 组长
 */
public class GroupLeader implements BudgetHandler {
    private BudgetHandler nextHandler;

    @Override
    public void setNextHandler(BudgetHandler handler) {
        nextHandler = handler;
    }

    @Override
    public boolean handle(Integer amount) {
        if(amount<=1000){
            System.out.println("groupleader-审批通过");
            return true;
        }
        return nextHandler.handle(amount);
    }
}

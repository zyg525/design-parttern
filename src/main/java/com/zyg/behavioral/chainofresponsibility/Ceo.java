package com.zyg.behavioral.chainofresponsibility;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:55
 * @Version: v1.0
 * @Description: 组长
 */
public class Ceo implements BudgetHandler {
    private BudgetHandler nextHandler;

    @Override
    public void setNextHandler(BudgetHandler handler) {
        nextHandler = handler;
    }

    @Override
    public boolean handle(Integer amount) {
        if(amount<=10000){
            System.out.println("ceo审批通过");
            return true;
        }
        System.out.println("金额太大，审批不通过");
        return false;
    }
}

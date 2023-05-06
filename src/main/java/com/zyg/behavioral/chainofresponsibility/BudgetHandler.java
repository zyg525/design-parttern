package com.zyg.behavioral.chainofresponsibility;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:54
 * @Version: v1.0
 * @Description: 预算处理器接口
 */
public interface BudgetHandler {
    void setNextHandler(BudgetHandler handler);

    boolean handle(Integer amount);
}

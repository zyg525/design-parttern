package com.zyg.behavioral.chainofresponsibility;

/**
 * @Author: zyg
 * @Date: 2023/5/6 9:57
 * @Version: v1.0
 * @Description: 责任链模式测试类
 */
public class ChainTest {
    public static void main(String[] args) {
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        Ceo ceo = new Ceo();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(ceo);

        groupLeader.handle(2000);
    }
}

package com.sfy.factory.staticfactory;

/**
 * @Description: MailSender.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.err.println("MailSender方法被执行");
    }

}

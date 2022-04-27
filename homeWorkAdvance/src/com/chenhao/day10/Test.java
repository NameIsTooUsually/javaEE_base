package com.chenhao.day10;

import java.util.Scanner;

/*
1. 写一个方法实现用户登陆，传入用户名和密码
2. 如果用户名错误，就抛出自定义登陆异常(LoginException)异常信息为用户名不存在。
3. 如果密码错了就也抛出登陆异常,异常信息为密码错误
4. 如果用户名和密码都对了,输出: 欢迎xxx
说明：正确用户名和密码都是admin
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String uesrName = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();
        try {
            check(uesrName,password);
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void check(String userName,String password) throws LoginException{
        if(!"admin".equals(userName)){
            throw new LoginException("用户名:" + userName + "不存在");
        }else if(!"admin".equals(password)){
            throw new LoginException("密码错误");
        }else{
            System.out.println("欢迎狗子");
        }
    }
}
class LoginException extends RuntimeException{
        private String message;

    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }
}



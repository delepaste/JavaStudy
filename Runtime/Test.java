package com.itheima.Runtime;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("QQ启动！！！！！");
        runtime.exec("C:\\Program Files\\Tencent\\QQNT\\QQ.exe");
        runtime.exit(0);
        System.out.println("QQ启动！！！！！");

    }
}

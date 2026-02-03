package com.alex.string;

import java.util.Random;

public class StringTest5 {
    private static final Random RANDOM = new Random();
    // 验证码可选字符集：数字0-9 + 大写A-Z + 小写a-z（和原代码逻辑一致）
    private static final String CODE_CHARSET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {


        System.out.println("4位验证码：" + generateCode(4));
        // 生成6位验证码（登录/注册常用）
        System.out.println("6位验证码：" + generateCode(6));
        // 生成8位验证码（支付/安全验证常用）
        System.out.println("8位验证码：" + generateCode(8));

    }
    public static String generateCode(int length) {
        // 1. 参数合法性校验：长度必须大于0，否则抛异常
        if (length <= 0) {
            throw new IllegalArgumentException("验证码长度必须大于0，当前传入：" + length);
        }

        // 2. 用StringBuilder拼接字符（循环拼接高性能，指定初始容量更优）
        StringBuilder codeBuilder = new StringBuilder(length);
        // 字符集长度，用于随机取索引
        int charsetLength = CODE_CHARSET.length();

        // 3. 循环length次，每次取一个随机字符拼接到结果中
        for (int i = 0; i < length; i++) {
            // 生成0 ~ 字符集长度-1的随机索引
            int randomIndex = RANDOM.nextInt(charsetLength);
            // 根据索引取字符，拼接到StringBuilder
            codeBuilder.append(CODE_CHARSET.charAt(randomIndex));
        }

        // 4. 转换为字符串返回
        return codeBuilder.toString();
    }

}

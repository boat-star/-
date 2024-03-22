package com.harmony.reggie.common;

/**
 * 基于ThreadLocal封装的工具类，用于保存、获取当前用户登入的ID
 */
public class BaseContext {

    // 作用域是每一个线程之内，每一个请求都是一个新的线程！！！
    // 虽然是static变量，但是每个线程都维护自己的副本
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    public static Long getCurrentId() {
        return threadLocal.get();
    }
}

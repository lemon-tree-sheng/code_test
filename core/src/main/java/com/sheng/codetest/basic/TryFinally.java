package com.sheng.codetest.basic;

import org.junit.Test;

/**
 * Created by shengxingyue on 2017/9/1.
 */
public class TryFinally {

    /**
     * try finally 的用法有些生疏了，在这里做了个小实验
     * try 块抛异常的时候，然后执行 finally，最后抛出异常，因为没有 catch 住
     */
    @Test
    public void testTryFinally() {
        try {
            int a = 1 / 0;
        } finally {
            System.out.println("hello");
        }
    }
}

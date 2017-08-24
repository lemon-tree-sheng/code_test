package com.sheng.basic;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * int 基本类型和 Integer包装类之间的各种比较
 * Created by shengxingyue on 2017/8/24.
 */
public class IntegerCompareToInt {

    /**
     *  int 和 integer 之间的比较，integer 会自动拆箱，== 用于比较总是可行的
     */
    @Test
    public void intCompareToInteger() {
        int int_a = 10;
        Integer integer_a = 10;
        Integer integer_b = new Integer(10);

        assertTrue(int_a == integer_a);
        assertTrue(int_a == integer_b);

        int int_aa = 1000;
        Integer integer_aa = 1000;
        Integer integer_bb = new Integer(1000);

        assertTrue(int_aa == integer_aa);
        assertTrue(int_aa == integer_bb);
    }

    /**
     *  integer 和 integer 之间的比较，在不确定 integer 取值的情况下最好都用 equals 比较
     */
    @Test
    public void integerCompareToInteger() {
        // 都是字面量赋值的情况下，-128 ~ 127 之间的 integer 会缓存进 IntegerCache， 这时候的 integer 字面量相同的情况下引用的同一个对象，== 可行
        Integer a = 10;
        Integer b = 10;

        assertTrue(a == b);

        // 虽然是字面量赋值，但是不在 -128 ~ 127 范围之内，aa,bb 都是指向新对象，对象地址不同，== 不可行，使用 equals
        Integer aa = 10000;
        Integer bb = 10000;

        assertTrue(aa != bb);
        assertTrue(aa.equals(bb));

        // new Integer 情况下，aaa 不会指向 IntegerCache 里面缓存的对象，== 不可行
        Integer aaa = new Integer(10);

        assertTrue(a != aaa);
        assertTrue(a.equals(aaa));
    }
}

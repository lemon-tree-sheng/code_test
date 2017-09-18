package com.sheng.codetest.mockito;

import org.junit.Test;
import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

/**
 * Created by shengxingyue on 2017/9/18.
 * mockito 的简单实用
 */
public class MockitoOrderTest extends BaseMockito{

    @Test
    public void testMockito() {
        List<String> list = mock(List.class);
        when(list.get(0)).thenReturn("hello world"); // 设置预期值

        when(list.get(1)).thenThrow(new RuntimeException()); // 设置抛异常

        doReturn("xiao hong").when(list).get(2); // 预期值设置的另一种写法

        assertEquals("hello world", list.get(0));
        assertEquals("xiao hong", list.get(2));
        verify(list).get(0); // 验证方法是否有被执行
    }
}

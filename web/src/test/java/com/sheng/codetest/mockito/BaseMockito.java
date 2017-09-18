package com.sheng.codetest.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * Created by shengxingyue on 2017/9/18.
 */
public abstract class BaseMockito {

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }
}

package com.sheng.codetest.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by shengxingyue on 2017/9/5.
 * 数字工具类
 */
public class NumberUtil {
    private static final long FEN_TO_YUAN = 100;

    /**
     * 转化数值单位方法
     * @param original
     * @param divideNumber
     * @param scale
     * @param roundingMode
     * @return
     */
    public static String convertUnit(long original, long divideNumber, int scale, RoundingMode roundingMode) {
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_UP;
        }
        if (original == 0) {
            return "0";
        }
        return new BigDecimal(original).divide(new BigDecimal(divideNumber), scale, roundingMode).toString();
    }
}

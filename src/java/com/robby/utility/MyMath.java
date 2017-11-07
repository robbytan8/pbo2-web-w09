package com.robby.utility;

/**
 *
 * @author Robby
 */
public class MyMath {

    public static Integer add(Integer value1, Integer value2) throws Exception {
        return Math.addExact(value1, value2);
    }

    public static Integer multiply(Integer value1, Integer value2) throws Exception {
        return Math.multiplyExact(value1, value2);
    }
}

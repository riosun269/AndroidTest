package com.example.demoandroid;

import org.junit.Assert;
import org.junit.Test;

import utils.Utils;

public class UtilsUnitTest {

    @Test
    public void test_sum() {
        Assert.assertEquals(5, Utils.sumNumber(2,3));
    }

    @Test
    public void test_sum_fail() {
        Assert.assertNotEquals(10, Utils.sumNumber(5,3));
    }

    @Test
    public void test_minus() {
        Assert.assertEquals(5, Utils.minusNumber(15,10));
    }

    @Test
    public void test_minus_failed() {
        Assert.assertNotEquals(9, Utils.minusNumber(15,10));
    }
}

package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax8To10Then10() {
        int first = 8;
        int second = 10;
        int result = Max.max(first, second);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To1Then2() {
        int first = 2;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1Then1() {
        int first = 1;
        int second = 1;
        int result = Max.max(first, second);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1To2Then3() {
        int first = 3;
        int second = 1;
        int third = 2;
        int result = Max.max(first, second, third);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1To1Then1() {
        int first = 1;
        int second = 1;
        int third = 1;
        int result = Max.max(first, second, third);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2To10To5Then10() {
        int first = 4;
        int second = 2;
        int third = 10;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2To2To2Then2() {
        int first = 2;
        int second = 2;
        int third = 2;
        int fourth = 2;
        int result = Max.max(first, second, third, fourth);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }
}
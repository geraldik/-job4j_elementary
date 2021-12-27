package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to21then1() {
        double expected = 1;
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to24then2() {
        double expected = 2;
        Point a = new Point(2, 2);
        Point b = new Point(2, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to50then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(5, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to100then1() {
        double expected = 1;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 0, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to345then7Dot07() {
        double expected = 7.07;
        Point a = new Point(0, 0, 0);
        Point b = new Point(3, 4, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when151to298then8Dot12() {
        double expected = 8.12;
        Point a = new Point(1, 5, 1);
        Point b = new Point(2, 9, 8);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}
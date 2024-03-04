package ru.itmo.potatocoder228.tpo;

import static org.junit.Assert.*;

import org.junit.Test;

import ru.itmo.potatocoder228.tpo.task1.Secans;

public class PowerSeriesTest {
    @Test
    public void TestFunction() {
        Secans secans = new Secans();
        assertEquals(1.85, secans.function(1), 1 / Math.pow(10, 3));
        assertEquals(1, secans.function(0), 1 / Math.pow(10, 3));
    }

    @Test
    public void TestFunctionDerivative() {
        Secans secans = new Secans();
        assertEquals(2.8824, secans.derivative(1, 1 / Math.pow(10, 4)), 1 / Math.pow(10, 3));
        assertEquals(0, secans.derivative(1, 0), 1 / Math.pow(10, 3));
        assertEquals(0, secans.derivative(1, -1), 1 / Math.pow(10, 3));
        assertEquals(0, secans.derivative(1, 1), 1 / Math.pow(10, 3));
    }

    @Test
    public void TestFunctionPowerSeries() {
        Secans secans = new Secans();
        assertEquals(1.85, secans.powerSeries(0.99, 1, 4), 1 / Math.pow(10, 3));
        assertEquals(0, secans.powerSeries(0.99, 1, 0), 1 / Math.pow(10, 3));
        assertEquals(0, secans.powerSeries(0, 0.01, -1), 1 / Math.pow(10, 3));
        assertEquals(0, secans.powerSeries(0, 0.01, -1), 1 / Math.pow(10, 3));
    }
}
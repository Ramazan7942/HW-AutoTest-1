package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackerTest {
    CashBackHacker service = new CashBackHacker();

    @Test
    public void testRemain1() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain2() {
        int amount = 500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain3() {
        int amount = 693;
        int actual = service.remain(amount);
        int expected = 307;

        assertEquals(actual, expected);
    }

    @Test
    public void testRemain4() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}
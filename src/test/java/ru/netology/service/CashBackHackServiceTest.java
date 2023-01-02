package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void testShouldReturn100() {
        CashBackHackService service = new CashBackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void testShouldReturn900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void testShouldReturn0() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}